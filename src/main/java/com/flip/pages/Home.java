package com.flip.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flip.keywords.Keywords;

public class Home {
	
	Keywords key = new Keywords();
	
	@FindBy(xpath = "//div[contains(text(),'Top Offers')]")
	public WebElement topOffer;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	public WebElement login;

	@FindBy(xpath = "//input[@name='q']")
	public WebElement searchBox;
	

	public Home() {
		PageFactory.initElements(Keywords.driver, this);
	}

	public void clickOnTopOffer() {
		
		topOffer.click();
	}

	public void moveToLogin() {
		
		key.hover(login);
	}
	
	public void enterTextInSearchBox()
	{
		key.enterText(searchBox,"java");
	}
	
}
