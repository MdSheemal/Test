package com.timeforge.generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class PropertyClass {
	
	public String getProperty()
	{
		String value="";
		try
		{
		Properties prop=new Properties();
		prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
		value=prop.getProperty(key);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return value;
		
	}

}
