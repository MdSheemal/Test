package com.timeforge.generic;

import java.util.List;

import org.openqa.selenium.WebElement;

public class GenericKeyword {
	
	public boolean getTxt(WebElement element,String text)
	{
		if(true)
		{
			element.sendKeys(text);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean getCalenderDate(List<WebElement> listOfElement,String enterDate)
	{
		if(true)
		{
			for(WebElement ele:listOfElement)
			  {
				String date=ele.getText();
				if(date.equalsIgnoreCase(enterDate))
				{
					ele.click();
					break;
				}
			   }
			  return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public boolean clickOnBtn(WebElement element)
	{
		if(true)
		{
			element.click();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean getTableData()
	{
		
		
		return false;
		
	}
	public boolean sendData(WebElement element,String text)
	{
	    if(true)
	    {
	    	element.sendKeys("text");
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
		
	}
	

}




