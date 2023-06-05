package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Utilities.WebUtils;

public class SignupPage extends WebUtils {

	@FindBy(xpath ="(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(linkText ="Create Account" )
	WebElement createaccount;

	@FindBy(xpath= "//input[@id='firstName']")
	WebElement firstname;

	@FindBy(xpath= "//input[@id='lastName']")
	WebElement lastname ;

	@FindBy(xpath= "//input[@id='email']")
	WebElement Emailaddress;

	@FindBy(xpath= "//input[@id='fld-p1']")
	WebElement CreateaccPwd;

	@FindBy(xpath= "//input[@id='reenterPassword']")
	WebElement confirmpwd;

	@FindBy(xpath= "//input[@id='phone']")
	WebElement createaccphone  ;

	@FindBy(xpath= "//button[@type='submit']")
	WebElement createaccsubmit ;

	@FindBy(xpath= "//span[@class='welcome-banner__user-name']")
	WebElement Welcomebanner;

	public SignupPage() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void create_Account(String first,String last,String
			email,String password,String conpassword,String phone) {

		try {
			explicitWait(usa, 3);
			clickbtn(usa);
			explicitWait(createaccount, 3);
			clickbtn(createaccount);
			explicitWait(firstname, 3);
			sendkey(firstname, first);
			explicitWait(lastname, 3);
			sendkey(lastname, last);
			explicitWait(Emailaddress, 3);
			sendkey(Emailaddress, email);
			explicitWait(CreateaccPwd, 3);
			sendkey(CreateaccPwd,password);
			explicitWait(confirmpwd, 3);
			sendkey(confirmpwd, conpassword);
			explicitWait(createaccphone, 3);
			sendkey(createaccphone, phone);
			clickbtn(createaccsubmit);
		} catch (Exception e) { 
			e.printStackTrace();
		}






	}



}
