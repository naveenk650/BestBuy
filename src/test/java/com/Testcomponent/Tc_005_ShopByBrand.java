package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.ShopByBrand;

public class Tc_005_ShopByBrand extends BaseClass {

	

	@Test
	public void shop_by_Brand_Validation() {
		try {
			ShopByBrand brand = new ShopByBrand();
			brand.shop_by_brand();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
