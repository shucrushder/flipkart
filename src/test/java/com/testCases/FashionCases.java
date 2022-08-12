package com.testCases;

import java.util.Set;

import org.testng.annotations.Test;

import com.config.BaseTest;
import com.flip.pages.Fashion;

public class FashionCases extends BaseTest{
	
	public void case_01(){
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
	}
	
	
	public void case_02() {
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.click_men_Top_Wear_All();
	}
	
	
	public void case_03() throws InterruptedException{
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_men_Botrtom_Wear();
	}
	
	
	public void case_04() {
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_men_Botrtom_Wear();
		fashion.click_men_Botrtom_Wear_jeans();
	}
	
	
	public void case_05() {
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_Women_ethentic();
	}
	
	
	public void case_06() {
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_men_Botrtom_Wear();
		fashion.click_men_Botrtom_Wear_jeans();
		key.time(5);
		fashion.click_mens_Jeans_Discount();
	}
	
	
	public void case_07()
	{
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_men_Botrtom_Wear();
		fashion.click_men_Botrtom_Wear_jeans();
		key.time(5);
		fashion.click_roadster();
	}
	
	
	public void case_08()
	{
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_men_Botrtom_Wear();
		fashion.click_men_Botrtom_Wear_jeans();
		String parent=key.driver.getWindowHandle();
		key.time(5);
		fashion.click_roadster();
		Set<String> child=key.driver.getWindowHandles();
		for(String s:child)
		{
			if(!s.equals(parent))
			{
				key.driver.switchTo().window(s);
			}
		}
		key.time(5);
		fashion.click_roadster_size();
	}
	
	@Test
	public void case_09() {
		Fashion fashion=new Fashion();
		fashion.hover_On_Fashion();
		fashion.hover_men_Botrtom_Wear();
		fashion.click_men_Botrtom_Wear_jeans();
		String parent=key.driver.getWindowHandle();
		key.time(5);
		fashion.click_roadster();
		Set<String> child=key.driver.getWindowHandles();
		for(String s:child)
		{
			if(!s.equals(parent))
			{
				key.driver.switchTo().window(s);
			}
		}
		key.time(5);
		fashion.click_roadster_size();
		key.time(5);
		fashion.click_Buy_Now();
	}
	
	
}
