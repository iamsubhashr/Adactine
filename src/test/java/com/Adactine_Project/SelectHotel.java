package com.Adactine_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public static WebDriver driver;  // null driver
	
	public SelectHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="radiobutton_0")
	private WebElement Clickradiobutton;

	public WebElement getClickradiobutton() {
		return Clickradiobutton;
	}

	@FindBy(name="continue")
	private WebElement Continuebutton;

	public WebElement getContinuebutton() {
		return Continuebutton;
	}
	
	
	
	
	
}