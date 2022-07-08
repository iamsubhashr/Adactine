package com.Adactine_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	
	private static WebDriver driver;  // null driver

	// method to get browser 
	public static WebDriver getBrowser(String type) {
		
		if(type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
		// method to get URL
		public static void getUrl(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		// method to input userName and password
		public static void inputText(WebElement element, String text ) {
			element.sendKeys(text);
		}
	
		// method to click signIn button
		public static void clickButton(WebElement element) {
			element.click();
		}
	
		// method to select data from dropDown
		public static void dropDown(WebElement element, String type, String data) {
			
			Select location = new Select(element);
			
			if(type.equalsIgnoreCase("Byvalue")){
				location.selectByValue(data);
			}
			else if(type.equalsIgnoreCase("Byvisibletext")) {
				location.selectByVisibleText(data);
			}
			else if(type.equalsIgnoreCase("Byindex")) {
				int indexvalue = Integer.parseInt(data);
				location.selectByIndex(indexvalue);
			}
			
		}
		// driver.close() method
		public static void close() {
			driver.close();
			
		}
		
		// implicit wait method
		public static void implicitWait(int waittime) {
			driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
		}
}
	
	
	
	

