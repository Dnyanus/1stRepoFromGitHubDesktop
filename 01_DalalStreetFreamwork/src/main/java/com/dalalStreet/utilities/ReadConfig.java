package com.dalalStreet.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		String path = System.getProperty("user.dir")+"\\src\\resource\\java\\config\\config.properties";	
		
		try 
		{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}

	public String getApplicationUrl()
	{
		String url = pro.getProperty("url");
		return url;		
	}
	
	public String getEmailAddress()
	{
		return pro.getProperty("email");
	}
	
	public String getPassword()
	{
		return pro.getProperty("password");
	}	
}
