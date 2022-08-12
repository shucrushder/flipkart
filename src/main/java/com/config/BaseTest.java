package com.config;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.flip.keywords.Keywords;
import com.flip.utill.Env;

public class BaseTest 
{
	public Keywords key=new Keywords();
	Env env=new Env();
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		String browser=env.getBrowser();
		key.launchBrowser(browser);
		key.getUrl(env.appURL());
		key.handlePopUp();
	}
	
	public void tearDown()
	{
		key.closeBrowser();
	}
}
