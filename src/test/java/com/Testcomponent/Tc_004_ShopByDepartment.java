package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.ShopByDepartment;

public class Tc_004_ShopByDepartment extends BaseClass {

	


	@Test
	public void shop_by_Department_Validation() {
		try {
			ShopByDepartment department = new ShopByDepartment();
			department.shop_by_dep();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
