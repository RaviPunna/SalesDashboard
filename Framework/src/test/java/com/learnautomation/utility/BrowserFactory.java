package com.learnautomation.utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver,String browserName, String appURL)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91901\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();		
		
		}
		else if (browserName.equals("Firefox"))
		{
			//System.setProperty(browserName, appURL);
		}
		else if(browserName.equals("IE"))
		{
			// write code
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(100));
		return driver;
	}
		
		public static void quitBrowser(WebDriver driver)
		{
			driver.quit();
		}
	}


