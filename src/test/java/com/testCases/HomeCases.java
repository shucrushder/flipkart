package com.testCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.config.BaseTest;
import com.flip.pages.Home;

public class HomeCases extends BaseTest {

	public void case_1() throws IOException {
		Home home = new Home();
		home.clickOnTopOffer();
	}
	
	
	public void case_2() {
		Home home = new Home();
		home.moveToLogin();
	}
	
	@Test
	public void case_3() {
		Home home= new Home();

		home.enterTextInSearchBox();
	}
	
	public void case_4()
	{
		
	}
}
