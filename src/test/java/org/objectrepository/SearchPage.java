package org.objectrepository;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	public SearchPage() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}
	@FindBy(id="location")
	private WebElement loction;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomno;
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getLoction() {
		return loction;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getDatepickin() {
		return datepickin;
	}
	public WebElement getDatepickout() {
		return datepickout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
	
	