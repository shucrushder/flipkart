package com.flip.utill;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Env 
{
	public String appURL() throws IOException
	{
		String baseDir=System.getProperty("user.dir");
		
		FileInputStream file=new FileInputStream(baseDir+"/src/main/resources/Env.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String url=prop.getProperty("app_url");
		
		return url;
	}
	
	public String getBrowser() throws IOException
	{
		String baseDir=System.getProperty("user.dir");
		
		FileInputStream file=new FileInputStream(baseDir+"/src/main/resources/Env.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String browser=prop.getProperty("browser");
		
		return browser;
	}
}
