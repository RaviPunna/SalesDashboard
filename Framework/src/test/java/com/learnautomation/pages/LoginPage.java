package com.learnautomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver ldriver)
{
	this.driver=ldriver;
}

	public void loginToCRM(String usernameApplication ,String usernamePassword) throws InterruptedException
{
		driver.findElement(By.xpath("//button[text()='Login with Google']")).click();
		
		Thread.sleep(3000);
		ArrayList<String>window1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(usernameApplication);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(usernamePassword);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://website-preprod.bricknbolt.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//input[@id='hyderabad']")).click();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravi986Automaton");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9869869865");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravipunna.qa@gmail.com");
		driver.findElement(By.xpath("//button[text()='Book Free Consultation']")).click();

		ArrayList<String> tabloc=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabloc.get(0));
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']//tr[2]//td[1]//a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		//ArrayList<String> tabloc1=new ArrayList<String>(driver.getWindowHandles());
	//	driver.switchTo().window(tabloc1.get(0));
		//driver.navigate().refresh();
		//driver.switchTo().window(tabloc1.get(1));
		//driver.close();
		//Set<String> handles=driver.getWindowHandles();
	//	for(String actual: handles) {
		//if(!actual.equalsIgnoreCase(currentHandle)) {
		//Switch to the opened tab
		//driver.switchTo().window(actual);
	//driver.navigate().refresh();
Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		//ArrayList<String1> tabloc1=new ArrayList<String1>();
		
			//driver.switchTo().window(tabloc1.get(1));
	
			System.out.println(driver.getCurrentUrl());
			
		driver.findElement(By.xpath("//div[text()='DOCUMENTS']")).click();

	}
		
		
		
		

}

