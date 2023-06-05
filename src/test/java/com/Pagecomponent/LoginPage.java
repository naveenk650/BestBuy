package com.Pagecomponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;

public class LoginPage extends WebUtils{

	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement Accountoption;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn' and @tabindex='0']")
	WebElement Signinbtn;

	@FindBy(xpath= "//input[@class='tb-input'and @type='email']")
	WebElement SigninUsernametext;

	@FindBy(xpath= "//input[@class='tb-input'and @type='password']")
	WebElement Signinpasswordtext;

	@FindBy(xpath= "//button[@type='submit']")
	WebElement Signinsubmitbtn;
	
	@FindBy(xpath= "//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
	WebElement warning;
	
	
	@FindBy(xpath= "//input[@placeholder='Hi, Naveen! What can we help you find today?']")
	WebElement WelcomePage;
	
	

	public LoginPage() {
		PageFactory.initElements(WebUtils.driver, this);
	}
	
	public void Sing_In(String Username,String Password) {
		try {
			explicitWait(usa, 2);
			clickbtn(usa);
			explicitWait(Accountoption, 3);
			clickbtn(Accountoption);
			test.log(Status.INFO, "Selected Account SignIn");
			explicitWait(Signinbtn, 3);
			clickbtn(Signinbtn);
			pageRefresh();
			explicitWait(SigninUsernametext, 3);
			sendkey(SigninUsernametext,Username);
			explicitWait(Signinpasswordtext, 3);
			test.log(Status.INFO, "Entered User Credentials");
			sendkey(Signinpasswordtext, Password);
			explicitWait(Signinsubmitbtn, 3);
			clickbtn(Signinsubmitbtn);
			explicitWait(warning, 3);
			getScreenShot("Login");
			test.log(Status.INFO, "Verified SigIn");
			//explicitWait(WelcomePage, 3);
			//String text = getText(WelcomePage);
			//Assert.assertEquals("Hi, Naveen", text);
			//test.log(Status.PASS,"User LoggedIn Sucessfully");
		} catch (Throwable e) {
			e.printStackTrace();
		//test.log(Status.FAIL, "Sigin Failed");
		}

	}
















}
