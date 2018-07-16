package com.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Greenshilling 
{
	public WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
	System.setProperty("webdriver.chrome.driver","./exefile/chromedriver");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://my.oodles.io/login/auth");
       	
	}
	@Test(dataProvider = "readData")
	public void searchkeywords(String username, String password) 
	{
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'login-btn')]")).click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@DataProvider(name="readData")
	public Object[][] readData()
	{
		Object [][] data = new Object[2][2];
		data[0][0] = "mohdsheemal@oodlestechnologies.com";
		data[0][1] = "1169khan";
		data[1][0] = "mohdsheemal@oodlestechnologies.com";
		data[1][1] = "1169khan";
		
		return data;
	}
	@AfterMethod
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
