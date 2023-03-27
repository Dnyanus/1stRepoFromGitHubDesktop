package com.dalalStreet.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_RegisterUpPage {

	public A_RegisterUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
//-------------- obj repo -----------------
	
	@FindBy (xpath ="//input[@name='firstName']")
	private WebElement firstname_txtbox;
	
	@FindBy (xpath ="//input[@id='formrow-lastname-Input']")
	private WebElement lastname_txtbox;
	
	@FindBy (xpath ="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy (xpath ="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy (xpath ="//input[@id='customControlInline']")
	private WebElement radio_btn;
	
	@FindBy (xpath ="//div[@class='mt-3 d-grid']")
	private WebElement get_your_journey_started_btn;
	
//-------------- obj repo -----------------
	
	
	public void enterFirstname(String firstname)
	{
		firstname_txtbox.sendKeys(firstname);
	}
	
	public void enterLastname(String lasttname)
	{
		lastname_txtbox.sendKeys(lasttname);
	}
	
	public void enterEmailId(String email)
	{
		email_txtbox.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnRadioButton()
	{
		radio_btn.click();
	}

	public void getYourJourneyStartedButton()
	{
		get_your_journey_started_btn.click();
	}
}
