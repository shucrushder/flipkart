package com.flip.keywords;

import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords 
{
	public static WebDriver driver;

	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}
	}
	
	public void getUrl(String url)
	{
		driver.get(url);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void handlePopUp()
	{
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	}
	
	public void handleAlert()
	{
		Alert alert=driver.switchTo().alert();
		
		alert.dismiss();
	}
	
	public void hover(WebElement target)
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(target).build().perform();
	}
	
	public void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public void enterText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	public void waitDemo()
	{
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(5));
	}
	
	public void time(int timesec)
	{
		long startTime=System.currentTimeMillis();
		long endtime=startTime+(timesec*1000);
		
		while(startTime<=endtime)
		{
			startTime=System.currentTimeMillis();
		}
	}
}
