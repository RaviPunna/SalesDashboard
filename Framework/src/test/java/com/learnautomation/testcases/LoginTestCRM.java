package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTestCRM extends BaseClass { 



@Test
	public void loginApp() throws InterruptedException 
	{
	Thread.sleep(3000);	
	logger=report.createTest("Login to CRM");
	
	
		LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToCRM(excel.getStringData("login", 0, 0),excel.getStringData("login", 0, 1));
		
		//loginPage.loginToCRM("Ravi.punna","password");
	//	Helper.captureScreenshot(driver);
		
		logger.pass("Login Sucess");
	
	
	}
}
	/*
	@Test
	public void firstCall()
	{
		
	}
	
}*/
