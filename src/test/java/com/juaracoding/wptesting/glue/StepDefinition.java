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
	@When("^User click Add Cart")
	public void user_click_Add_Cart() {
		addcartPage.goToAddCart();
		extentTest.log(LogStatus.PASS, "User click Add Cart");
	}
	
	@When("^User go to menu Add Cart")
	public void user_go_to_menu_Add_Cart() {
		extentTest.log(LogStatus.PASS, "User go to menu Add Cart");
	}
	
	@When("^User click returnshop")
	public void user_click_returnshop() {
		addcartPage.gotoAddCart2();
		extentTest.log(LogStatus.PASS, "User click returnshop");
	}
	
	//	SHOES PRODUCT COMPARE
	@When("^User click picture compare shoes1")
	public void user_click_picture_compare_shoes1() {
		addcartPage.compareShoes1();
		extentTest.log(LogStatus.PASS, "User click picture compare shoes1");
	}
	
	@When("^User click picture compare shoes2")
	public void user_click_picture_compare_shoes2() {
		addcartPage.compareShoes2();
		extentTest.log(LogStatus.PASS, "User click picture compare shoes2");
	}
	
	@When("^User pick one shoes")
	public void user_pick_one_shoes() {
		addcartPage.pickShoes();
		extentTest.log(LogStatus.PASS, "User pick one shoes");
	}
	
	@When("^User click color pick brown")
	public void user_click_color_pick_brown() {
		addcartPage.gotoAddCart3();
		extentTest.log(LogStatus.PASS, "User click color pick brown");
	}
	
	@When("^User click size pick tigatujuh")
	public void user_click_size_pick_tigatujuh() {
		addcartPage.gotoAddCart4(2);
		extentTest.log(LogStatus.PASS, "User click size pick tigatujuh");
	}
	
	@When("^User click addtocart")
	public void user_click_addtocart() {
		addcartPage.gotoAddCart5();
		extentTest.log(LogStatus.PASS, "User click addtocart");
	}
	
//	Glass from Search
	@When("^User click search")
	public void user_click_search() {
		addcartPage.searchGlass();
		extentTest.log(LogStatus.PASS, "User click search");
	}
	
	@When("^User click input glass")
	public void user_click_input_glass() {
		addcartPage.inputSearchGlass(configurationProperties.getSearchGlass());
		extentTest.log(LogStatus.PASS, "User click input glass");
	}
	
	@When("^User click pictures glass")
	public void user_click_picture_glass() {
		addcartPage.pickGlass();
		extentTest.log(LogStatus.PASS, "User click pictures glass");
	}
	
	@When("^User click color pick white and click size pick one")
	public void user_click_color_pick_white_and_click_size_pick_one() {
		addcartPage.dropDownGlass();
		extentTest.log(LogStatus.PASS, "User click color pick white and click size pick one");
	}
	
	@Then("^User click addtocart glass")
	public void user_click_addtocart_glass() {
		addcartPage.dropDownGlass();
		extentTest.log(LogStatus.PASS, "User click addtocart glass");
	}
	
//	CartPage Proceed Checkout
	@When("^User click addcart")
	public void user_click_addcart() {
		addcartPage.goToAddCart();
		extentTest.log(LogStatus.PASS, "User click addcart");
	}
	
	@When("^User go to Cartpage")
	public void user_go_to_Cartpage() {
		checkoutPage.gotoCartPage();
		extentTest.log(LogStatus.PASS, "User go to Cartpage");
	}
	
	@When("^User click checkout")
	public void user_click_checkout() {
		checkoutPage.gotoCheckout();
		extentTest.log(LogStatus.PASS, "User click checkout");
	}
	
	@When("^User input firstname lastname company address1 address2 city postcode phone additional")
	public void user_input_firstname_lastname_company_address1_address2_city_postcode_phone_additional() {
		checkoutPage.gotoFinish(configurationProperties.getFirstname(), configurationProperties.getLastname(), configurationProperties.getCompany(), configurationProperties.getSelectCountry(), configurationProperties.getAddress1(), configurationProperties.getAddress2(), configurationProperties.getCity(), configurationProperties.getSelectState(), configurationProperties.getPostcode(), configurationProperties.getPhone(), configurationProperties.getAdditional());
		extentTest.log(LogStatus.PASS, "User input firstname lastname company address1 address2 city postcode phone additional");
	}
	
	@Then("^User click check button terms and Place order")
	public void user_click_check_button_terms_and_Place_order() {
		checkoutPage.gotoFinish2();
		extentTest.log(LogStatus.PASS, "User click check button terms and Place order");
	}
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
