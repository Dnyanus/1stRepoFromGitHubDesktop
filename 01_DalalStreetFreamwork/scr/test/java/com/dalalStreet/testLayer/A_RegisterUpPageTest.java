package com.dalalStreet.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalalStreet.pageLayer.B_LoginPage;
import com.dalalStreet.pageLayer.A_RegisterUpPage;
import com.dalalStreet.testBase.TestBase;
import com.dalalStreet.utilities.UtilClass;

public class A_RegisterUpPageTest extends TestBase{

	@Test
	public void VerifySignUpWithCorrectCred()
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		login_obj.clickOnSignUpButton();
		registerUpPage_Obj.enterFirstname("Dnyanu");
		registerUpPage_Obj.enterLastname("Jagtap");
		registerUpPage_Obj.enterEmailId("dnyanu197@gmail.com");
		registerUpPage_Obj.enterPassword("@Test@1234");
		registerUpPage_Obj.clickOnRadioButton();
		registerUpPage_Obj.getYourJourneyStartedButton();
		
		Assert.assertEquals(util_obj.getWebPageUrl(),expected_output );
	}
}
