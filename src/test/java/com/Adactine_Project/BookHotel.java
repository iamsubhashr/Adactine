package com.Adactine_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;
	
	public BookHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="first_name")
	private WebElement Firstname;
	
	public WebElement getFirstname() {
		return Firstname;
	}
	
	@FindBy(name="last_name")
	private WebElement Lastname;

	public WebElement getLastname() {
		return Lastname;
	}
	
	@FindBy(name="address")
	private WebElement Billingaddress;

	public WebElement getBillingaddress() {
		return Billingaddress;
	}
	
	@FindBy(name="cc_num")
	private WebElement Creditcardno;

	public WebElement getCreditcardno() {
		return Creditcardno;
	}
	
	@FindBy(name="cc_type")
	private WebElement Creditcardtype;

	public WebElement getCreditcardtype() {
		return Creditcardtype;
	}
	
	@FindBy(name="cc_exp_month")
	private WebElement Expirymonth;

	public WebElement getExpirymonth() {
		return Expirymonth;
	}
	
	@FindBy(name="cc_exp_year")
	private WebElement Expirtyyear;

	public WebElement getExpirtyyear() {
		return Expirtyyear;
	}
	
	@FindBy(name="cc_cvv")
	private WebElement Cvvnumber;

	public WebElement getCvvnumber() {
		return Cvvnumber;
	}
	
	@FindBy(name="book_now")
	private WebElement Booknow;

	public WebElement getBooknow() {
		return Booknow;
	}
	
}
