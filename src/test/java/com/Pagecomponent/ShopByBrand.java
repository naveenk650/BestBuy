package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;

public class ShopByBrand extends WebUtils {

	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(xpath ="//button[@data-t='hamburger-navigation-button']")
	WebElement hamburgerbtn;

	@FindBy(xpath ="//button[@data-id='node-87']")
	WebElement brand;

	@FindBy(linkText = "Sony")
	WebElement sony;

	@FindBy(linkText = "Sony home audio")
	WebElement sonyaudio;

	@FindBy(linkText ="Sony - STRDH590 - 725W 5.2-Ch. Hi-Res 4K Ultra HD HDR A/V Home Theater Receiver - Black")
	WebElement amplifier;

	@FindBy(xpath ="//button[@data-sku-id='6187502']")
	WebElement brandadd2cart;

	@FindBy(xpath ="//span[@class='added-to-cart']")
	WebElement addedtocart;

	public ShopByBrand() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void shop_by_brand() {

		try {
			explicitWait(hamburgerbtn, 3);
			clickbtn(hamburgerbtn);
			test.log(Status.INFO, "Navigated to Menu");
			explicitWait(brand, 3);
			clickbtn(brand);
			test.log(Status.INFO, "Selected product by Brand");
			explicitWait(sony, 3);
			clickbtn(sony);
			explicitWait(sonyaudio, 3);
			clickbtn(sonyaudio);
			explicitWait(amplifier, 3);
			clickbtn(amplifier);
			explicitWait(brandadd2cart, 3);
			clickbtn(brandadd2cart); 
			test.log(Status.INFO, "Product added to cart");
			explicitWait(addedtocart, 3);
			String text = getText(addedtocart);
			Assert.assertEquals("Added to cart", text);
			System.out.println(text);
			test.log(Status.PASS,"Shop by Brand Validation Succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL, "Shop by Brand Validation Failed");
		}


	}}
