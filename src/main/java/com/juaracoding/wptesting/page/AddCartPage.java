package com.juaracoding.wptesting.page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class AddCartPage {
	
public WebDriver driver;
	
	public AddCartPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/a/span/span[2]")
	private WebElement btnCart;
	
	@FindBy(xpath = "//*[@id=\"post-6\"]/div/div/p[2]/a")
	private WebElement btnReturnShop;
	
//	SHOES
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-meta > div.woocommerce.product.compare-button > a")
	private WebElement compareShoes1;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1318.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-meta > div.woocommerce.product.compare-button > a")
	private WebElement compareShoes2;
	
	@FindBy(css = "#cboxClose")
	private WebElement btnCloseCompare;
	
	@FindBy(css ="#DataTables_Table_0 > tbody > tr.add-to-cart.odd > td.even.product_1318 > a")
	private WebElement btnSelectShoes;
	
	@FindBy(xpath = "//*[@id=\"pa_color\"]/option[2]")
	private WebElement btnColorShoes;
	
	@FindBy(xpath = "//*[@id=\"pa_size\"]")
	private WebElement btnSizeShoes;
	
	@FindBy(xpath = "//*[@id=\"product-1318\"]/div[1]/div[2]/form/div/div[2]/button")
	private WebElement addtocartShoes;
	
//	GLASS
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
	private WebElement searchGlass;
	
	@FindBy(css = "input[name='s']")
	private WebElement inputSearchGlass;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1323.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.last.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > a > img")
	private WebElement btnGlass;
	
	@FindBy(xpath = "//*[@id=\"pa_color\"]/option[2]")
	private WebElement btnColorGlass;
	
	@FindBy(xpath = "//*[@id=\"pa_size\"]/option[2]")
	private WebElement btnSizeGlass;
	
	@FindBy(xpath = "//*[@id=\"product-1323\"]/div[1]/div[2]/form/div/div[2]/button")
	private WebElement addtocartGlass;
	
	
	public void gotoAddCart() {
		btnCart.click();
	}
	
	public void gotoAddCart2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,350)");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		btnReturnShop.click();
	}
	
	public void compareShoes1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,350)");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		Actions action = new Actions(driver);
		action.moveToElement(compareShoes1).click().perform();
		action.moveToElement(btnCloseCompare).click().perform();
	}
	
	public void compareShoes2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		action.moveToElement(compareShoes2).click().perform();
	}
	
	public void pickShoes() {
		btnSelectShoes.click();
	}
	
	public void gotoAddCart3() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		btnColorShoes.click();
	}
	
	public void gotoAddCart4(int selection) {
		btnSizeShoes.click();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void gotoAddCart5() {
		addtocartShoes.click();
	}
	
	public void searchGlass() {
		searchGlass.click();
	}
	
	public void inputSearchGlass(String searchglass) {
		inputSearchGlass.sendKeys(searchglass);
		inputSearchGlass.sendKeys(Keys.ENTER);
	}
	
	public void pickGlass() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		btnGlass.click();
	}

	public void dropDownGlass() {
		btnColorGlass.click();
		btnSizeGlass.click();
		addtocartGlass.click();
	}
	

}
