package com.timeforge.generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassGeneric {
	
	public void selectClass(WebElement element,int index)
	{
		Select sel=new Select(element);
		List<WebElement> listOfWebElem=sel.getOptions();
		int count=listOfWebElem.size();
		System.out.println("Total Element present in dropdown should be Eight--> "+count);
		for(int i=0;i<count;i++)
		{
			String text=listOfWebElem.get(i).getText();
			System.out.println("List of element Present in dropDown->"+text);
			
		}
		sel.selectByIndex(index);
	}
	public String getSelectedValueOfRowsPerPage(WebElement element)
	{
		Select sel=new Select(element);
		return sel.getFirstSelectedOption().getText();
	}
	public void setValueForRowsPerPage(String visibleText,WebElement element)
	{
	    if(!(visibleText.equals("")||visibleText==null))
	    {
	        Select select=new Select(element);
	        select.selectByVisibleText(visibleText);
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
