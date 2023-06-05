package com.Pagecomponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;


public class BottomLinks extends WebUtils{


	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(linkText ="Accessibility")
	WebElement Accessibility;

	@FindBy(linkText ="Terms & Conditions")
	WebElement TermsConditions;

	@FindBy(linkText ="Privacy")
	WebElement Privacy;

	@FindBy(linkText ="Interest-Based Ads")
	WebElement InterestBasedAds;

	@FindBy(linkText ="State Privacy Rights")
	WebElement StatePrivacyRights;

	@FindBy(linkText ="CA Do Not Sell/Share My Personal Information")
	WebElement MyPersonalInformation;

	@FindBy(linkText ="Limit Use of My Sensitive Personal Information")
	WebElement MySensitivePersonalInformation;

	@FindBy(linkText ="Targeted Advertising Opt Out")
	WebElement Advertising;

	@FindBy(linkText ="CA Supply Chain Transparency Act")
	WebElement Transparency;


	public BottomLinks() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public  void Accessibility_Link_Validation() {
		try {
			explicitWait(usa, 3);
			clickbtn(usa);
			explicitWait(Accessibility, 3);
			clickbtn(Accessibility);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Accessibility - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Accessibility : Link Validation failed");
		}
	}

	public void Terms_Conditions_validation (){
		try {
			explicitWait(TermsConditions, 3);
			clickbtn(TermsConditions);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("BestBuy.com Terms and Conditions", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Terms & Conditions : Link Validation failed");
		}
	}

	public void Privacy_validation (){
		try {
			explicitWait(Privacy, 3);
			clickbtn(Privacy);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Privacy Policy Hub - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Privacy : Link Validation failed");

		}

	}

	public void InterestBased_Ads_validation (){
		try {
			explicitWait(InterestBasedAds, 3);
			clickbtn(InterestBasedAds);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Interest-Based Ads - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Interest-Based Ads : Link Validation failed");
		}
	}

	public void State_PrivacyRights_validation (){
		try {
			explicitWait(StatePrivacyRights, 3);
			clickbtn(StatePrivacyRights);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("State Privacy Rights - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," State Privacy Rights : Link Validation failed");
		}

	}

	public void Transparency_validation (){
		try {
			explicitWait(Transparency, 3);
			clickbtn(Transparency);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("California Supply Chain Transparency Act - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," CA Supply Chain Transparency Act : Link Validation failed");
		}

	}


	public void My_PersonalInformation_validation (){
		try {
			explicitWait(MyPersonalInformation, 3);
			clickbtn(MyPersonalInformation);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Start Request - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," CA Do Not Sell/Share My Personal Information : Link Validation failed");
		}

	}


	public void My_SensitiveInformation_validation (){
		try {
			implicitWait(3);
			naviBack();
			explicitWait(MySensitivePersonalInformation, 3);
			clickbtn(MySensitivePersonalInformation);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Limit Use of My Sensitive Personal Information : Link Validation failed");
		}


	}


	public void Advertising_validation (){
		try {
			implicitWait(3);
			naviBack();
			explicitWait(Advertising, 3);
			clickbtn(Advertising);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Start Request - Best Buy", title);
			test.log(Status.PASS, title+" Link : Validated Sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL," Targeted Advertising Opt Out : Link Validation failed");
		}

	}








































}



