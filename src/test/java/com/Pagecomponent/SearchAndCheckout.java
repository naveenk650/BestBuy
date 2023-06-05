package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;

public class SearchAndCheckout extends WebUtils{


	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(xpath ="//input[@id='gh-search-input']")
	WebElement searchbox;

	@FindBy(xpath ="//button[@class='header-search-button']")
	WebElement magnifierbtn;

	@FindBy(linkText  ="MacBook Air 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray")
	WebElement Macbook;

	@FindBy(xpath ="//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button' and @data-sku-id='5721600']")
	WebElement addtocart;

	@FindBy(xpath ="//span[@class='added-to-cart']")
	WebElement Added;

	@FindBy(linkText  ="Go to Cart")
	WebElement GotoCart;

	@FindBy(xpath ="//button[@class ='c-close-icon c-modal-close-icon' and @type='button']")
	WebElement closebtn;

	@FindBy(xpath ="//button[@class ='btn btn-lg btn-block btn-primary' and @type='button']")
	WebElement checkout;

	@FindBy(xpath ="//button[@class ='c-button c-button-secondary c-button-lg cia-guest-content__continue guest' and @type='button']")
	WebElement guest;

	@FindBy(xpath ="//input[@id='user.emailAddress']")
	WebElement emailtextbox;

	@FindBy(xpath ="//input[@id='user.phone']")
	WebElement phonetextbox;

	@FindBy(xpath ="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuepaymentbtn;

	@FindBy(xpath ="//input[@id='first-name']")
	WebElement firstnametextbox;

	@FindBy(xpath ="//input[@id='last-name']")
	WebElement lastnametextbox;

	@FindBy(xpath ="//input[@id='number']")
	WebElement cardtextbox;

	@FindBy(xpath ="//input[@id='address-input']")
	WebElement addressinput;

	@FindBy(xpath ="//input[@id='city']")
	WebElement city;

	@FindBy(xpath ="//input[@id='postalCode']")
	WebElement zipcode;

	@FindBy(xpath ="//select[@id='state']")
	WebElement stateDropdown;

	@FindBy(xpath ="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorderbtn;

	public SearchAndCheckout() {
		PageFactory.initElements(WebUtils.driver, this);
	}


	public void search_AddToCart() {

		try {
			explicitWait(usa, 3);
			clickbtn(usa);
			explicitWait(searchbox, 3);
			sendkey(searchbox, "Apple macbook");
			explicitWait(magnifierbtn, 3);
			clickbtn(magnifierbtn);
			test.log(Status.INFO, "Selected Product Using SearchBox");
			explicitWait(addtocart, 3);
			clickbtn(addtocart);
			test.log(Status.INFO, "Product Added to Cart");
			explicitWait(Added, 3);
			String text = getText(Added);
			Assert.assertEquals("Added to cart", text);
			test.log(Status.PASS,"Shop by SearchBox Validation Succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL, "Shop by SearchBox Validation Failed");

		}
	}
	public void checkout_validation() {

		try {
			explicitWait(GotoCart, 3);
			clickbtn(GotoCart);
			explicitWait(closebtn, 3);
			clickbtn(closebtn);
			explicitWait(checkout, 3);
			clickbtn(checkout);
			explicitWait(guest, 3);
			clickbtn(guest);
			explicitWait(emailtextbox, 3);
			sendkey(emailtextbox, "kumar123@gmail.com");
			explicitWait(phonetextbox, 3);
			sendkey(phonetextbox, "9876543210");
			explicitWait(continuepaymentbtn, 3);
			clickbtn(continuepaymentbtn);
			explicitWait(firstnametextbox, 3);
			getScreenShot("Checkout error");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void payment_validation() {

		try {
			explicitWait(firstnametextbox, 3);
			sendkey(firstnametextbox, "naveen");
			explicitWait(lastnametextbox, 3);
			sendkey(lastnametextbox, "kumar");
			explicitWait(addressinput, 3);
			sendkey(addressinput, "9912 DIMITROS AVE. SUITE 101");
			explicitWait(city, 3);
			sendkey(city, "Abbeville ");
			explicitWait(zipcode, 3);
			sendkey(zipcode, "70510 ");
			selectDownVisible(stateDropdown, "AL");
			explicitWait(cardtextbox, 3);
			sendkey(cardtextbox, "5855987432148564");
			explicitWait(placeorderbtn, 3);
			clickbtn(placeorderbtn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
