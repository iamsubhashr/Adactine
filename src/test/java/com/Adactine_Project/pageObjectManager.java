package com.Adactine_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageObjectManager {

	public static WebDriver driver; // null driver
	public LoginPage lp;
	public SearchHotel sh;
	public SelectHotel selHotel;
	public BookHotel bh;
	
	public pageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public LoginPage getLoginPage() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public SearchHotel getSearchHotel() {
		sh = new SearchHotel(driver);
		return sh;
	}
	
	public SelectHotel getSelectHotel() {
		selHotel = new SelectHotel(driver);
		return selHotel;
	}
	
	public BookHotel getBookHotel() {
		bh = new BookHotel(driver);
		return bh;
		
	}
	
	public BookingConfirm getBookingconfirm() {
		BookingConfirm bc = new BookingConfirm(driver);
		return bc;
	}
	
	
	
	
}
