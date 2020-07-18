package org.objectrepository;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectionPage extends BaseClass {
	public selectionPage() {
	
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement con;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getCon() {
		return con;
	}

}
