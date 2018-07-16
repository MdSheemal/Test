package com.timeforge.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementClass {
	
	public static void implictiWaitforSec(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void implicitWaitforMin(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
	}
	public static void implictWaitforHour(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void explicitWaitforClickable(WebDriver driver,int time,WebElement element)
	{
	     WebDriverWait wait=new WebDriverWait(driver,time);
	     //wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void explicitWaitforVisiblity(WebDriver driver,int time,WebElement element1)
	{
		WebDriverWait wait1=new WebDriverWait(driver, time);
		//wait1.until(ExpectedConditions.visibilityOf(element1));
	}
	public static void threadSleepWait(int time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
