package com.dalalStreet.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_PlaceSellOrderPage {

	private WebDriver driver;
	public F_PlaceSellOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
//-------------- obj repo -----------------	
	@FindBy (xpath ="//a[@class='active nav-link']")
	private WebElement buy_radio_btn;
	
	@FindBy (xpath ="//a[@class='nav-link']")
	private WebElement sell_radio_btn;

//------------------------------------------------	
	@FindBy (xpath ="//label[@for='btnradio5']")
	private WebElement long_term_radio_btn_2;
	
	@FindBy (xpath ="//label[@for='btnradio6']")
	private WebElement intraday_radio_btn_2;
	
	@FindBy (xpath ="//label[@for='btnradio7']")
	private WebElement market_radio_btn_2;
	
	@FindBy (xpath ="//label[@for='btnradio8']")
	private WebElement custom_limit_btn_2;
//-----------------------------------------------------	
	@FindBy (xpath ="//input[@name='input-Quantity']")     
	private WebElement quantity_txtbox;
	
	@FindBy (xpath ="(//input[@type='number'])[4]")
	private WebElement price_txtbox;
//----------------------------------------------------	
	
	@FindBy (xpath ="//button[contains(text(),'Sell')]")
	private WebElement sell_order_btn;
	
	@FindBy (xpath ="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']")
	private WebElement get_popup_Text;
	
//-------------- action methods -----------------	
	
	public void clickOnBuyRadioButton()
	{
		buy_radio_btn.click();
	}
	
	public void clickOnSellRadioButton()
	{
		sell_radio_btn.click();
	}

//-------------------------------------------------	
	public void clickOnLongTermRadioButton2()
	{
		long_term_radio_btn_2.click();
	}
	
	public void clickOnIntradayRadioButton2()
	{
		intraday_radio_btn_2.click();
	}
	
	public void clickOnMarketRadioButton2()
	{
		market_radio_btn_2.click();
	}
	
	public void clickOnCustomLimitRadioButton2()
	{
		custom_limit_btn_2.click();
	}
//-----------------------------------------------	
	public void enterQuantity(String quantity)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(quantity);
	}
	
	public void enterPrice(String price)
	{
		price_txtbox.click();
		price_txtbox.sendKeys(price);
	}
//-------------------------------------------------	

	public void clickOnSellButton()
	{
		sell_order_btn.click();
	}
	
	
	public String popup()
	{
		Actions act = new Actions(driver);		
		act.moveToElement(get_popup_Text).build().perform();		
		System.out.println(get_popup_Text.getText());
		String result = get_popup_Text.getText();
		return result;
	}
}
