package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.LoginPage;

public class Tc_001Login extends BaseClass{
	
	
	

	@Test
public void valid_username_Password() {//Positive Test Case
		//Verify if a user will be able to login with a valid username and valid password.
		try {
			LoginPage log = new LoginPage();
			log.Sing_In(readProperty("ValidUsername"), readProperty("Validpassword"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
}
	@Test
	public void inValidUsername_InvalidPassword() {//Negative Test Case
		//Verify if a user cannot login with a invalid username and an invalid password.
		try {
			LoginPage log = new LoginPage();
			log.Sing_In(readProperty("InvalidUsername"), readProperty("Invalidpassword"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void blank_Username_Password() {//Negative Test Case
		//Verify the login page for both, when the field is blank and Submit button is clicked.
		try {
			LoginPage log = new LoginPage();
			log.Sing_In(readProperty(" "), readProperty(" "));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		

	}
}
