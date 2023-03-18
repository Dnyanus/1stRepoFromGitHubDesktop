package com.dalalStreet.pageLayer;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_DashboardPage {

	public C_DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
//-------------- obj repo -----------------	
	
	@FindBy (xpath ="(//input[@type='text'])[1]")
	private WebElement search_txtbox;
	
	@FindBy (xpath ="(//div[@class='m-2 card-title'])[4]")
	private WebElement select_company_option;
	
	@FindBy (xpath ="//a[normalize-space()='Dashboard']")
	private WebElement dashboard_btn;
	
	@FindBy (xpath ="//a[@href='/exchanges']")
	private WebElement exchanges_btn;
	
	@FindBy (xpath ="//a[normalize-space()='Transactions']")
	private WebElement transaction_link;
	
	@FindBy (xpath ="//a[normalize-space()='Portfolio']")
	private WebElement portfolio_btn;
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']")
	private WebElement profile_dropdown;

	@FindBy(xpath="//a[@href='/logout']")
	private WebElement power_off_btn;
	
//-------------- obj repo -----------------	
	public void enterCompanyName(String company_name)
	{
		search_txtbox.sendKeys(company_name);
	}
	
	public void clickOnCompanyOption()
	{
		select_company_option.click();
	}
	
	public void clickOnDashboardButton()
	{
		dashboard_btn.click();
	}
	
	public void clickOnExchangesButton()
	{
		exchanges_btn.click();
	}

	public void clickOnTransactionButton()
	{
		transaction_link.click();
	}

	public void clickOnPortfolioButton()
	{
		portfolio_btn.click();
	}
	
	public void clickOnProfileDropdown()
	{
		profile_dropdown.click();
	}
	
	public void clickOnPowerOff()
	{
		power_off_btn.click();
	}
}
