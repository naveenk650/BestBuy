package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.AllMenu;

public class Tc_003_AllMenu extends BaseClass{

	@Test
	public void All_Menu_validation() {
		try {
			AllMenu menu = new AllMenu();
			menu.TopDeals();
			menu.DealoftheDay();
			menu.TotaltechMembership();
			menu.CreditCards();
			menu.GiftCards();
			menu.GiftIdeas();
			menu.HealthWellness();
			menu.BestBuyOutlet();
			menu.BestBuyBusiness();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
