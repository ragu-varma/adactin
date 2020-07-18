package org.objectrepository;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmationPage extends BaseClass {
	public confirmationPage() {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	public WebElement getOrderno() {
		return orderno;
	}
	

}
