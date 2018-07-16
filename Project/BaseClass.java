package com.timeforge.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class BaseClass {
	public WebDriver driver;
	public PropertyClass prop;
	public WebDriver initializeDriver()
	{
		 	
		        prop=new PropertyClass();
				String browser=prop.getProperty("./src/main/resources/config.properties", "browser");
				if(browser.equalsIgnoreCase("firefox"))
				{
					driver=new FirefoxDriver();
					Reporter.log("Firefox Launched",true);
				}
				if(browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "./src/main/resources/exefiles/chromedriver.exe");
					driver=new ChromeDriver();
					Reporter.log("Chrome Launched",true);
				}
				if(browser.equalsIgnoreCase("IE"))
				{
					System.setProperty("webdriver.ie.driver", "./exefiles/IEDriverServer.exe");
					driver=new InternetExplorerDriver();
					Reporter.log("IE Launched",true);
				}
				driver.manage().window().maximize();
				WaitStatementClass.implicitWaitforMin(driver, 20);
		        return driver;
	}


}
