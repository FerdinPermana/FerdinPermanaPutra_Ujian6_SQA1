package com.juaracoding.wptesting.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class CheckoutPage {
	
private WebDriver driver;
	
	public CheckoutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".button.wc-forward")
	private WebElement btnViewcart;
	
	@FindBy(css = ".checkout-button.button.alt.wc-forward")
	private WebElement btnCheckout;
	
	@FindBy(id = "billing_first_name")
	private WebElement txtfirstname;
	
	@FindBy(id = "billing_last_name")
	private WebElement txtlastname;
	
	@FindBy(id = "billing_company")
	private WebElement txtcompany;
	
//	@FindBy(css = "")
//	private WebElement cmbcountry;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtaddress;
	
	@FindBy(id = "billing_city")
	private WebElement txtcity;
	
//	@FindBy(css = "")
//	private WebElement cmbprovince
	@FindBy(id = "billing_postcode")
	private WebElement txtpostcode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtphone;
	
	@FindBy(id = "billing_email")
	private WebElement txtemail;
	
	@FindBy(id = "place_order")
	private WebElement btnplaceorder;
	
	public void goToCheckout() {
		btnViewcart.click();
		btnCheckout.click();
	}
	
	public void goToOrder(String firstname, String lastname, String company, String address, String city, String postcode, String phone, String email) {		
		txtfirstname.sendKeys(firstname);
		txtlastname.sendKeys(lastname);
		txtcompany.sendKeys(company);
//		cmbcity
		txtaddress.sendKeys(address);
		txtcity.sendKeys(city);
//		cmbprovince
		txtpostcode.sendKeys(postcode);
		txtphone.sendKeys(phone);
		txtemail.sendKeys(email);
		btnplaceorder.click();
	}
}
