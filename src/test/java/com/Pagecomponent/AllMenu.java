package com.Pagecomponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;


public class AllMenu extends WebUtils {

	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(linkText ="Top Deals")
	WebElement TopDeals;

	@FindBy(linkText ="Deal of the Day")
	WebElement DealoftheDay;

	@FindBy(linkText ="Totaltech Membership")
	WebElement TotaltechMembership;

	@FindBy(linkText ="Credit Cards")
	WebElement CreditCards;

	@FindBy(linkText ="Gift Cards")
	WebElement GiftCards;

	@FindBy(xpath ="//button[@data-lid='hdr_utility_more']")
	WebElement more;

	@FindBy(linkText ="Gift Ideas")
	WebElement GiftIdeas;

	@FindBy(linkText ="Health & Wellness")
	WebElement HealthWellness;

	@FindBy(linkText ="Best Buy Outlet")
	WebElement BestBuyOutlet;

	@FindBy(linkText ="Best Buy Business")
	WebElement BestBuyBusiness;

	public AllMenu() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public  void TopDeals() {
		try {
			explicitWait(usa, 3);
			clickbtn(usa);
			explicitWait(TopDeals, 3);
			clickbtn(TopDeals);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Top Deals and Featured Offers on Electronics - Best Buy", title);
			test.log(Status.PASS, "Top Deals : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Top Deals : Title Validation failed");
		}
	}

	public  void DealoftheDay() {
		try {
			explicitWait(DealoftheDay, 3);
			clickbtn(DealoftheDay);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Deal of the Day: Electronics Deals - Best Buy", title);
			test.log(Status.PASS, "Deal of the Day : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Deal of the Day : Title Validation failed");
		}
	}

	public  void TotaltechMembership() {
		try {

			explicitWait(TotaltechMembership, 3);
			clickbtn(TotaltechMembership);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy Totaltech™ – Best Buy", title);
			test.log(Status.PASS, "Total tech Membership : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Total tech Membership : Title Validation failed");
		}
	}


	public  void CreditCards() {
		try {

			explicitWait(CreditCards, 3);
			clickbtn(CreditCards);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy Credit Card: Rewards & Financing", title);
			test.log(Status.PASS, "Credit Card : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Credit Card : Title Validation failed");
		}
	}

	public  void GiftCards() {
		try {

			explicitWait(GiftCards, 3);
			clickbtn(GiftCards);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Gifts Cards and E-Gift Cards - Best Buy", title);
			test.log(Status.PASS, "Gifts Cards : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Gifts Cards : Title Validation failed");
		}
	}


	public  void GiftIdeas() {
		try {

			explicitWait(GiftIdeas, 3);
			clickbtn(GiftIdeas);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy", title);
			test.log(Status.PASS, "Gift Ideas : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Gift Ideas : Title Validation failed");
		}
	}


	public  void HealthWellness() {
		try {

			explicitWait(more, 3);
			clickbtn(more);
			explicitWait(HealthWellness, 3);
			clickbtn(HealthWellness);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Health & Wellness Solutions & Technology - Best Buy", title);
			test.log(Status.PASS, "Health & Wellness : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Health & Wellness : Title Validation failed");
		}
	}


	public  void BestBuyOutlet() {
		try {

			explicitWait(more, 3);
			clickbtn(more);
			explicitWait(BestBuyOutlet, 3);
			clickbtn(BestBuyOutlet);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy", title);
			test.log(Status.PASS, "Best Buy Outlet : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Best Buy Outlet : Title Validation failed");
		}
	}


	public  void BestBuyBusiness() {
		try {

			explicitWait(more, 3);
			clickbtn(more);
			explicitWait(BestBuyBusiness, 3);
			clickbtn(BestBuyBusiness);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy for Business - Best Buy", title);
			test.log(Status.PASS, "Best Buy Business : Title Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Best Buy Business : Title Validation failed");
		}
	}


}
