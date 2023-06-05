package com.Pagecomponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;

public class ShopByDepartment extends WebUtils{

	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(xpath ="//button[@data-t='hamburger-navigation-button']")
	WebElement hamburgerbtn;

	@FindBy(xpath ="//button[@data-id='node-286']")
	WebElement tvHometheatre;

	@FindBy(xpath ="//button[@data-id='node-248']")
	WebElement Hometheatre;

	@FindBy(linkText ="Home Theater & Shelf Systems")
	WebElement hmandSelf;

	@FindBy(linkText = "VIZIO - 2.0-Channel V-Series Home Theater Sound Bar with DTS Virtual:X - Black")
	WebElement viz2pointone;

	@FindBy(xpath ="//button[@type='button' and @data-sku-id='6471427']")
	WebElement depadd2cart;

	@FindBy(xpath ="//span[@class='added-to-cart']")
	WebElement addedtocart;

	


	public ShopByDepartment() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void shop_by_dep() {

		try {
			explicitWait(usa, 2);
			clickbtn(usa);
			explicitWait(hamburgerbtn, 3);
			clickbtn(hamburgerbtn);
			test.log(Status.INFO, "Navigated to Menu");
			explicitWait(tvHometheatre, 2);
			clickbtn(tvHometheatre);
			test.log(Status.INFO, "Selected product by Department");
			explicitWait(Hometheatre, 2);
			clickbtn(Hometheatre);
			explicitWait(hmandSelf, 2);
			clickbtn(hmandSelf);
			explicitWait(viz2pointone, 3);
			clickbtn(viz2pointone);
			explicitWait(depadd2cart, 3);
			clickbtn(depadd2cart);
			test.log(Status.INFO, "Product added to cart");
			explicitWait(addedtocart, 3);
			String text = getText(addedtocart);
			Assert.assertEquals("Added to cart", text);
			test.log(Status.PASS,"Shop by Department Validation Succesfull");

		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL, "Shop by Department Validation Failed");
		}

	}

	

	}





