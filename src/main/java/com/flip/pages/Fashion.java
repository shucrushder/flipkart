package com.flip.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flip.keywords.Keywords;

public class Fashion 
{
	Keywords key=new Keywords();

	@FindBy(xpath="//div[contains(text(),'Fashion')]")
	public WebElement fashion;

	@FindBy(xpath = "//a[@class=\"_6WOcW9 _3YpNQe\"]")
	public WebElement men_Top_Wear_All;

	@FindBy(xpath = "(//div[@class=\"_3XS_gI _7qr1OC\"]/child::a)[2]")
	public WebElement men_Botrtom_Wear;

	@FindBy(xpath = "(//a[@class=\"_6WOcW9 _3YpNQe\"])[2]")
	public WebElement men_Botrtom_Wear_Mens_Jeans;

	@FindBy(xpath ="(//a[@class=\"_6WOcW9\"])[2]")
	public WebElement womens_ethentic;

	@FindBy(xpath="(//div[@class='_2gmUFU _3V8rao'])[2]")
	public WebElement mens_Jeans_Discount;

	@FindBy(xpath = "(//a[@class=\"IRpwTa\"])[1]")
	public WebElement roadster;
	
	@FindBy(xpath = "(//a[@class=\"_1fGeJ5 _2UVyXR _31hAvz\"])[2]")
	public WebElement roadster_size;
	
	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]")
	public WebElement buyNow;

	public Fashion()
	{
		PageFactory.initElements(key.driver, this);
	}
	public void hover_On_Fashion() {
		key.hover(fashion);
	}

	public void click_men_Top_Wear_All(){
		key.click(men_Top_Wear_All);
	}

	public void hover_men_Botrtom_Wear()
	{
		key.hover(men_Botrtom_Wear);
	}

	public void click_men_Botrtom_Wear_jeans() {
		key.click(men_Botrtom_Wear_Mens_Jeans);
	}

	public void hover_Women_ethentic() {
		key.hover(womens_ethentic);;
	}

	public void click_mens_Jeans_Discount(){
		key.click(mens_Jeans_Discount);
	}

	public void click_roadster() {
		key.click(roadster);
	}
	
	public void click_roadster_size() {
		key.click(roadster_size);
	}
	
	public void click_Buy_Now() {
		key.click(buyNow);
	}
}
