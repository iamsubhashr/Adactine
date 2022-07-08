package com.Adactine_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;   // null driver
	
	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id="hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(name="room_type")
	private WebElement Roomtype;

	public WebElement getRoomtype() {
		return Roomtype;
	}
	
	@FindBy(id="room_nos")
	private WebElement Numberofrooms;

	public WebElement getNumberofrooms() {
		return Numberofrooms;
	}
	
	@FindBy(name="adult_room")
	private WebElement Adultsperroom;


	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}
	
	@FindBy(id="child_room")
	private WebElement Childrenperroom;

	public WebElement getChildrenperroom() {
		return Childrenperroom;
	}
	
	@FindBy(id="Submit")
	private WebElement Searchbutton;

	public WebElement getSearchbutton() {
		return Searchbutton;
	}
	
	
	
	
	
	
	
	
	
	
}
