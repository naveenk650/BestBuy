package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.BottomLinks;

public class Tc_008_Bottomlink extends BaseClass {

	@Test
	public void bottom_Links_Validation() {
		try {
			BottomLinks link = new BottomLinks();
			link.Accessibility_Link_Validation();
			link.Terms_Conditions_validation();
			link.Privacy_validation();
			link.InterestBased_Ads_validation();
			link.State_PrivacyRights_validation();
			link.Transparency_validation();
			link.My_PersonalInformation_validation();
			link.My_SensitiveInformation_validation();
			link.Advertising_validation();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 
		
		
}
}
