package com.Testcomponent;
import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.SignupPage;


public class Tc_002_SignUp extends BaseClass {

	@Test
	public void valid_credentials_SignUp() {
		SignupPage sign = new SignupPage();
		sign.create_Account(readProperty("first"), readProperty("last"),readProperty("email"),
				readProperty("password"),readProperty("password"), readProperty("phone"));
	}
	
	
	@Test
	public void Invalid_credentials_Name() {
		//Check validation by entering alphabets and special characters.
		SignupPage sign = new SignupPage();
		sign.create_Account(readProperty("phone"), readProperty("email"),readProperty("password"),
				readProperty("email"),readProperty("last"), readProperty("password"));
	}
	
	
	@Test
	public void blank_signup() {
		/*Verify that if no value is passed to the fields and 
		submit button is clicked then it leads to a validation error.*/
		SignupPage sign = new SignupPage();
		sign.create_Account("", "", "", "", "","");
	}
	
	
}
