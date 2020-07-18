package org.objectrepository;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass {
	public loginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtuser;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getPass() {
		return pass;
	}
	
}
