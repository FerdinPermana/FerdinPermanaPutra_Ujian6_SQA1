package com.juaracoding.wptesting.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class CheckoutPage {
	
private WebDriver driver;
	
	public CheckoutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/a/span/span[2]")
	private WebElement btnCartPage;
	
	@FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
	private WebElement btnCheckout;
	
	@FindBy(id = "billing_first_name")
	private WebElement txtfirstname;
	
	@FindBy(id = "billing_last_name")
	private WebElement txtlastname;
	
	@FindBy(id = "billing_company")
	private WebElement txtcompany;
	
	@FindBy(id = "select2-billing_country-container")
	private WebElement selectCountry;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtaddress1;
	
	@FindBy(id = "billing_address_2")
	private WebElement txtaddress2;
	
	@FindBy(id = "billing_city")
	private WebElement txtcity;
	
	@FindBy(id = "select2-billing_state-container")
	private WebElement selectState;
	
	@FindBy(id = "billing_postcode")
	private WebElement txtpostcode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtphone;
	
	@FindBy(id = "order_comments")
	private WebElement txtAdditional;
	
	@FindBy(xpath = "//*[@id=\"terms\"]")
	private WebElement checkbtnTerms;
	
	@FindBy(xpath = "//*[@id=\"place_order\"]")
	private WebElement btnCheckoutFinish;
	
	public void gotoCartPage() {
		btnCartPage.click();
	}
	
	public void gotoCheckout() {
		btnCheckout.click();
	}
	
	public void gotoFinish(String firstname, String lastname, String company, 
			String address1, String address2, String city, String postcode, 
			String phone, String additional, String country, String state) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		txtfirstname.sendKeys(firstname);
		txtlastname.sendKeys(lastname);
		txtcompany.sendKeys(company);
		selectCountry.click();
		new Select(selectCountry).selectByVisibleText(country);
		txtaddress1.sendKeys(address1);
		txtaddress2.sendKeys(address2);
		js.executeScript("window.scrollBy(0,500)");
		txtcity.sendKeys(city);
		selectState.click();
		new Select(selectState).selectByVisibleText(state);
		txtpostcode.sendKeys(postcode);
		txtphone.sendKeys(phone);
		js.executeScript("window.scrollBy(0,100)");
		txtAdditional.sendKeys(additional);
	}
	
	public void gotoFinish2() {
		checkbtnTerms.click();
		btnCheckoutFinish.click();
	}
}
