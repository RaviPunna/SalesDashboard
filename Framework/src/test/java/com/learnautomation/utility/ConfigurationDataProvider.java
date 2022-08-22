package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationDataProvider {
	Properties pro;
	public ConfigurationDataProvider()
	{
		File src=new File("C:\\AUTOMATION\\FRAMEWORK_SPACE\\Framework\\Configuration\\Configuration.properties");
	try {
		FileInputStream fis= new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);
		
	} catch (Exception e) {
		System.out.println("Not able to load configuration file"+e.getMessage());
	}
	}
	public String getDataFromConfiguration(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getStagingURL()
	{
	return pro.getProperty("qaURL");	
	}
	
}
