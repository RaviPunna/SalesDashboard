package com.learnautomation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigurationDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class BaseClass {
 public WebDriver driver;
 public ExcelDataProvider excel;
 public ConfigurationDataProvider configuration;
 public ExtentReports report;
 public ExtentTest logger;
 
 
 	@BeforeSuite
 	public void setUpSuite()
 		{
 		excel=new ExcelDataProvider();
 		configuration=new ConfigurationDataProvider();
 		 //ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
 		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/Sales.html"));
 		report=new ExtentReports();
 		report.attachReporter(extent);
 		
 		}
 
	@BeforeClass
	public void setup()
		{
		//driver=BrowserFactory.startApplication(driver,"chrome","https://sales-preprod.bricknbolt.com/login");
		driver=BrowserFactory.startApplication(driver,configuration.getBrowser(),configuration.getStagingURL());
		}

	/*@AfterClass
	public void teardown()
	 	{
		BrowserFactory.quitBrowser(driver);
		}*/
	
	@AfterMethod
	public void teardownMethod(ITestResult result)
		{
		if(result.getStatus()==ITestResult.FAILURE)
			{
			Helper.captureScreenshot(driver);	
			}
		
		report.flush();
		}
	
	
	
	
}
