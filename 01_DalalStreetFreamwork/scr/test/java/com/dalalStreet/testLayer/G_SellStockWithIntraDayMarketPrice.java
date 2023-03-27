package com.dalalStreet.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalalStreet.testBase.TestBase;

public class G_SellStockWithIntraDayMarketPrice extends TestBase{

	@Test
	public void verifyStockSellingWithIntradayMarketPrice() throws InterruptedException
	{	
		Thread.sleep(5000);
		
		dashboard_page_obj.enterCompanyName("ICICI");
		dashboard_page_obj.clickOnCompanyOption();
		
		Thread.sleep(5000);
		place_an_sell_order_obj.clickOnSellRadioButton();
		place_an_sell_order_obj.clickOnIntradayRadioButton2();
		place_an_sell_order_obj.clickOnMarketRadioButton2();
		place_an_sell_order_obj.enterQuantity("2");
		place_an_sell_order_obj.clickOnSellButton();
		
		Thread.sleep(1000);
		String expected_output = "Limit Order Created Successfully";
		Assert.assertEquals(place_an_sell_order_obj.popup(), expected_output);	
	
	}
}
