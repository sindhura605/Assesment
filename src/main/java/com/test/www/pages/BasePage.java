package com.test.www.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.test.www.framework.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class BasePage extends BaseTest{
	@Before
	public void openBrowser() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("Application.properties");
		prop.load(fis);
	}
	
	public void navigateToHomePage() {
		driver.get(prop.getProperty("applicationHomePage"));
	}

}
