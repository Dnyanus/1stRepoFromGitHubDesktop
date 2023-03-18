package com.dalalStreet.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalalStreet.pageLayer.B_LoginPage;
import com.dalalStreet.pageLayer.C_DashboardPage;
import com.dalalStreet.testBase.TestBase;
import com.dalalStreet.utilities.UtilClass;

public class B2_LogoutFunctionalityTest extends TestBase {
	
	@Test
	public void verifyLogoutFunctionality() throws InterruptedException
	{
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
				
		Thread.sleep(3000);
		dashboard_page_obj.clickOnProfileDropdown();
		dashboard_page_obj.clickOnPowerOff();
		
		Thread.sleep(3000);
		Assert.assertEquals(util_obj.getWebPageUrl(), expected_result);
		
	}
}
