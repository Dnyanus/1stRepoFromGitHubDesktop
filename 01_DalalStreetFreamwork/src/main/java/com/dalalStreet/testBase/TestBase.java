package com.dalalStreet.testBase;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.dalalStreet.utilities.ReadConfig;
import com.dalalStreet.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	public UtilClass util_obj;
	
	
//---------------------------------------------------------------
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("DalalStreat Automation Freamework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution Started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution Stopped");
	}

//----------------------------------------------------------------
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) throws InterruptedException
	{	
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}
		
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}
		
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();			
		}
		else
		{
			System.out.println("Heyyyy Man You Are Giving Wrong Browser Input");
		}
		
	//-----------------------------------------------------
		
		ReadConfig read_config = new ReadConfig();
		
	//------------------ Browser initialization---------------------------
		driver.manage().window().maximize();
		driver.get(read_config.getApplicationUrl());
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Brower launches, url, maximize");
		
	//------------------ Object Creation---------------------------
		
		
	//------------------ login steps ------------------------

		Thread.sleep(5000);
		logger.info("Login the application");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
//		driver.quit();
	}
}
