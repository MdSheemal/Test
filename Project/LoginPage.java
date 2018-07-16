package com.timeforge.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.timeforge.generic.BaseClass;
import com.timeforge.generic.GenericKeyword;
import com.timeforge.generic.PropertyClass;

public class LoginPage {
	
	@FindBy(id=("j_username"))
	private WebElement userNm;
	
	@FindBy(id="j_password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
      PropertyClass prop=new PropertyClass();
      GenericKeyword  g=new GenericKeyword();
		userNm.sendKeys(prop.getProperty("./src/main/resources/config.properties", "username"));
		password.sendKeys(prop.getProperty("./src/main/resources/config.properties", "password"));
		g.clickOnBtn(login);
	}
	
	
}
