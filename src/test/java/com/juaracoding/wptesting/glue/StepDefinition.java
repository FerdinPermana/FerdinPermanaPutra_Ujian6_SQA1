package com.juaracoding.wptesting.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.wptesting.driver.DriverSingleton;
import com.juaracoding.wptesting.utils.ConfigurationProperties;
import com.juaracoding.wptesting.utils.Constants;
import com.juaracoding.wptesting.utils.TestCases;
import com.juaracoding.wptesting.utils.Utils;
import com.juaracoding.wptesting.config.AutomationFrameworkConfiguration;
import com.juaracoding.wptesting.page.AddCartPage;
import com.juaracoding.wptesting.page.CheckoutPage;
import com.juaracoding.wptesting.page.LoginPage;
import com.juaracoding.wptesting.page.RegisterPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
//	private RegisterPage registerPage;
	private LoginPage loginPage;
	private AddCartPage addcartPage;
	private CheckoutPage checkoutPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
//		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		addcartPage = new AddCartPage();
		checkoutPage = new CheckoutPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	// Register
//	@When("^User click myaccount button")
//	public void User_click_myaccount_buttonn() {
//		registerPage.goToRegisterPage();
//		extentTest.log(LogStatus.PASS, "User click  myaccount button");
//	}
//	
//	@Then("^User input username emailaddress password and click Register")
//	public void User_input_username_emailaddress_password_and_click_Register() {
//		registerPage.goRegister(configurationProperties.getUserName(), configurationProperties.getEmailaddress(), configurationProperties.getPassword());
//		extentTest.log(LogStatus.PASS, "User input username password and click Login");
//	}
	
	//Login
	@When("^User click myaccount button")
	public void User_click_myaccount_button() {
		loginPage.goToLoginPage();
		extentTest.log(LogStatus.PASS, "User click  myaccount button");
	}
	
	@Then("^User input username password and click Login")
	public void User_input_username_password_and_click_Login() {
		loginPage.goToLoggedIn(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username password and click Login");
	}
	
	// Add Cart
	@When("^User click orders button")
	public void User_click_order_button() {
		addcartPage.goToAddCartShoes();
		extentTest.log(LogStatus.PASS, "User click  order button");
	}
	
//	@And("^User click browseProduct button")
//	public void User_click_browseProduck_button() {
//		addcartPage.goToAddCartShoes();
//		extentTest.log(LogStatus.PASS, "User click  browseProduct button");
//	}
//	
//	@And("^User click shoes button")
//	public void User_click_shoes_button() {
//		addcartPage.goToAddCartShoes();
//		extentTest.log(LogStatus.PASS, "User click  shoes button");
//	}
//	
//	@And("^User click color button")
//	public void User_click_color_button() {
//		addcartPage.goToAddCartShoes();
//		extentTest.log(LogStatus.PASS, "User click  color button");
//	}
//	
//	@And("^User click size button")
//	public void User_click_size_button() {
//		addcartPage.goToAddCartShoes();
//		extentTest.log(LogStatus.PASS, "User click  size button");
//	}
//	
//	@Then("^User click addCart button")
//	public void User_click_addCart_button() {
//		addcartPage.goToAddCartShoes();
//		extentTest.log(LogStatus.PASS, "User click  addCart button");
//	}
	
//	@When("^User click search and input glass")
//	public void User_click_search_and_input_glass() {
//		addcartPage.goToAddCartGlass(configurationProperties.getSearch());
//		extentTest.log(LogStatus.PASS, "User click  order button");
//	}
	
	// Check out
//	@When("^User click viewcart button")
//	public void User_click_viewcart_button() {
//		checkoutPage.goToCheckout();
//		extentTest.log(LogStatus.PASS, "User click  myaccount button");
//	}
//	
//	@And("^User click checkout button")
//	public void User_click_checkout_button() {
//		checkoutPage.goToCheckout();
//		extentTest.log(LogStatus.PASS, "User input username password and click Login");
//	}
//	
//	@Then("^User input location firstname lastname company address city postcode phone email and click placeorder")
//	public void User_input_location_firstname_lastname_company_address_city_postcode_phone_email_and_click_placeorder() {
//		checkoutPage.goToOrder(configurationProperties.getFirstname(), configurationProperties.getLastname(), configurationProperties.getCompany(), configurationProperties.getAddress(), 
//				configurationProperties.getCity(), configurationProperties.getPostcode(), configurationProperties.getPhone(), configurationProperties.getEmail());
//		extentTest.log(LogStatus.PASS, "User input firstname,lastname,company,address,city,postcode,phone, email and click PlaceOrder");
//	}
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
