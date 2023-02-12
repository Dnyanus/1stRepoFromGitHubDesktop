package com.dalalStreet.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalalStreet.pageLayer.B_LoginPage;
import com.dalalStreet.testBase.TestBase;
import com.dalalStreet.utilities.UtilClass;

public class B1_LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
//		login_obj.enterEmailAddress(excel_data.readData("LOgin",4, 1));
//		login_obj.enterPassword(excel_data.readData("Login", 4, 2));
//		login_obj.clickOnLoginButton();		
	
		Thread.sleep(3000);	
		Assert.assertEquals(util_obj.getWebPageUrl(), expected_output);
		logger.info("Login done successfully");
	}
}
