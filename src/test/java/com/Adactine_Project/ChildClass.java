package com.Adactine_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildClass extends BaseClass{

	public static WebDriver driver = getBrowser("Chrome");
	public static pageObjectManager pom = new pageObjectManager(driver);
	public static void main(String[] args) throws IOException {

		
		
		getUrl(FileReadManager.getInstanceFR().getInstanceCR().get_Url());
		inputText(pom.getLoginPage().getUsername(),FileReadManager.getInstanceFR().getInstanceCR().getUsername());
		inputText(pom.getLoginPage().getPassword(),FileReadManager.getInstanceFR().getInstanceCR().getPassword());
		clickButton(pom.getLoginPage().getLogin());
		
		// search hotel page -> Location
		dropDown(pom.getSearchHotel().getLocation(), "Byvisibletext", "London");
		
		// search hotel page
		dropDown(pom.getSearchHotel().getHotels(), "Byindex", "2");
		dropDown(pom.getSearchHotel().getRoomtype(), "Byvalue", "Standard");
		dropDown(pom.getSearchHotel().getNumberofrooms(), "Byindex", "4");
		dropDown(pom.getSearchHotel().getAdultsperroom(), "Byindex", "2");
		dropDown(pom.getSearchHotel().getChildrenperroom(), "Byindex", "3");
		clickButton(pom.getSearchHotel().getSearchbutton());
		
		// select hotel page
		clickButton(pom.getSelectHotel().getClickradiobutton());
		clickButton(pom.getSelectHotel().getContinuebutton());
		
		// Book a hotel page
		inputText(pom.getBookHotel().getFirstname(), FileReadManager.getInstanceFR().getInstanceCR().getFirstname());
		inputText(pom.getBookHotel().getLastname(), FileReadManager.getInstanceFR().getInstanceCR().getLastname());
		inputText(pom.getBookHotel().getBillingaddress(), FileReadManager.getInstanceFR().getInstanceCR().getBillingaddress());
		inputText(pom.getBookHotel().getCreditcardno(), FileReadManager.getInstanceFR().getInstanceCR().getCreditcardno());
		dropDown(pom.getBookHotel().getCreditcardtype(), "Byindex", "2");
		dropDown(pom.getBookHotel().getExpirymonth(), "Byindex", "3");
		dropDown(pom.getBookHotel().getExpirtyyear(), "Byindex", "12");
		inputText(pom.getBookHotel().getCvvnumber(), FileReadManager.getInstanceFR().getInstanceCR().getCvvno());
		clickButton(pom.getBookHotel().getBooknow());
		
		
		// booking confirmation
		//clickButton(pom.getBookingconfirm().getMyitinerary());
		
		// takesScreenshot
		TakesScreenshot ts = (TakesScreenshot)driver;           // narrowing type casting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\subaa\\eclipse-workspace\\Adactine_Project\\screenshot\\img2.jpg");
		FileUtils.copyFile(source, destination);
		
		System.out.println("screenshot finished");

		// implicit method - global wait
		//implicitWait(90);
		
		// logout
		
		
		//close();
	}

}
