package com.Adactine_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm {

	public static WebDriver driver;
	
	public BookingConfirm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="my_itinerary")
	private WebElement Myitinerary;

	public WebElement getMyitinerary() {
		return Myitinerary;
	}
}
