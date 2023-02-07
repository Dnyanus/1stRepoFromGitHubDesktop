package com.dalalStreet.utilities;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.dalalStreet.testBase.TestBase;

public class UtilClass extends TestBase{

	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
//---------get Url-------------
	public String getWebPageUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
//---------Scroll till webElement--------------
	public void scroll_Upto_Element(WebElement WebElement_Object )
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].scrollIntoView();",WebElement_Object);
	}
	
//---------Scroll till co-ordinates--------------
	public void scroll_By_XY(String x, String y )
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
//----------ScreenShot code---------------------------	

	public static void takeSS(String filename)
	{
		String path = "C:\\Users\\Dnyaneshwar\\eclipse-workspace\\0001_DalalStreetFreamwork\\screenshots\\";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	//-------------------
		String date_time = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss")
		        .format(Calendar.getInstance().getTime());
	//-------------------
		File des = new File(path+filename+"-"+date_time+".png");
		try 
		{
			FileHandler.copy(src, des);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}	
}
