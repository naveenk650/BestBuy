package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.SearchAndCheckout;

public class Tc_007_SearchCheckoutPayment extends BaseClass{
	@Test
	public void searchpaymentValidation() {

		try {
			SearchAndCheckout scp = new SearchAndCheckout();
			scp.search_AddToCart();
			scp.checkout_validation();
			scp.payment_validation();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}