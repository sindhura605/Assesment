package com.test.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.www.framework.BaseTest;

public class GoogleHomePage extends BaseTest{
	By txt_SearchBox=By.name("q");
	
	public void searchProduct(String keyword) {
		enterText(driver, txt_SearchBox, keyword);
		clickButton(driver, Keys.ENTER);
	}

}
