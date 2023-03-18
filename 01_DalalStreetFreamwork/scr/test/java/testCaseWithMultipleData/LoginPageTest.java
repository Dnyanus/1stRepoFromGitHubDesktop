package testCaseWithMultipleData;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.dalalStreet.testBase.TestBase;
import com.dalalStreet.utilities.ExcelHandling;

public class LoginPageTest extends TestBase {
	
	@Test(dataProvider = "LoginTestData")
	public void verifyLoginWithCorrectCred(String sr_no, String email, String password) throws InterruptedException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		login_obj.enterEmailAddress(email);
		login_obj.enterPassword(password);
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);	
		
		//---convert String sr_no to int 
		int row_index = Integer.parseInt(sr_no);
		
		if(util_obj.getWebPageUrl().equals(expected_output))
		{
			excel_data.writeData("Login", row_index, 3, "passed");
		}
		else
		{
			excel_data.writeData("Login", row_index, 3,"failed");
		}
		
		Assert.assertEquals(util_obj.getWebPageUrl(), expected_output);
		logger.info("Login done successfully");
	}
//=================================================================================
	//--------Data Provider
	
	@DataProvider(name = "LoginTestData")
	public String[][] getLoginData()
	{
		ExcelHandling excel_data1 = new ExcelHandling();
		int r = excel_data1.getRowNumber("Login");
		int c = excel_data1.getCellNumber("Login", 1);
		
		String loginData[][] = new String[r][c];
		
		for (int i=1; i<=r; i++)
		{
			for(int j=0; j<c; j++)
			{
				loginData[i-1][j] = excel_data1.readData("Login", i, j);
			}
		}
		return loginData;
	}
}
