package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.SearchAndCheckout;

public class Tc_006_ShopBySearch extends BaseClass {

	@Test
	public void search_Box_Validation() {
		try {
			SearchAndCheckout sc = new SearchAndCheckout();
			sc.search_AddToCart();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
