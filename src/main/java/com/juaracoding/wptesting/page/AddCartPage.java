package com.juaracoding.wptesting.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.wptesting.driver.DriverSingleton;

public class AddCartPage {
	
private WebDriver driver;
	
	public AddCartPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Orders']")
	private WebElement btnOrders;
	
//	@FindBy(css = ".woocommerce-Button.button")
//	private WebElement btnBrowseProduct;
//	
//	@FindBy(css = "div:nth-child(3) div:nth-child(1) h3:nth-child(1) a:nth-child(1)")
//	private WebElement btnShoes;
//	
//	@FindBy(id = "pa_color")
//	private WebElement btnColor1;
//	
//	@FindBy(id = "pa_size")
//	private WebElement btnSize1;
//	
//	@FindBy(css = "button[class='single_add_to_cart_button button alt']")
//	private WebElement btnaddCart1;
//	
//	@FindBy(css = "a[class='noo-search'] i[class='icon_search']")
//	private WebElement btnSearch;
//	
//	@FindBy(css = "#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
//	private WebElement txtsearch;
//	
//	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1348.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > h3 > a")
//	private WebElement btnGlass;
//	
//	@FindBy(id = "pa_color")
//	private WebElement btnColor2;
//	
//	@FindBy(id = "pa_size")
//	private WebElement btnSize2;
//	
//	@FindBy(css = "#product-1348 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
//	private WebElement btnaddCart2;

	public void goToAddCartShoes() {
		btnOrders.click();
//		btnBrowseProduct.click();
//		btnShoes.click();
//		btnColor1.click();
//		btnSize1.click();
//		btnaddCart1.click();
	}
	
//	public void goToAddCartGlass(String search) {
//		btnSearch.click();
//		txtsearch.sendKeys(search);
//		btnColor2.click();
//		btnSize2.click();
//		btnaddCart2.click();
//	}

}
