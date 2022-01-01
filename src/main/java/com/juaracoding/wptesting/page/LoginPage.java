package com.juaracoding.wptesting.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > p > a")
	private WebElement btnPopupMesaage;
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2)")
	private WebElement btnRegisterPage;
	
	@FindBy(id = "username")
	private WebElement txtUsername;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
	private WebElement btnLogin;
	
	
	public void goToLoginPage() {
		btnPopupMesaage.click();
		btnRegisterPage.click();
	}
	
	public void goToLoggedIn(String username, String password) {		
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
}
