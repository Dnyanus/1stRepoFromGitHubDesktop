package com.dalalStreet.pageLayer;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_LoginPage {

	public B_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- obj repo -----------------
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	@FindBy (xpath ="//a[@class='fw-medium text-primary']")
	private WebElement sign_up_btn;
	
	@FindBy (xpath ="")
	private WebElement forgot_your_password_link;
	
	//------------ action methods -------------
	
	public void clickOnSignUpButton()
	{
		sign_up_btn.click();
	}
	
	public void enterEmailAddress(String email)
	{
		email_txtbox.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
	
	public void clickOnForgotYourYasswordLink()
	{
		login_btn.click();
	}
	
}
