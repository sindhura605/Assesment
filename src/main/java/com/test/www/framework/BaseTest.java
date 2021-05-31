package com.test.www.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;

	public void openBrowser(String browsername) {
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/main/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
	}
	public void enterText(WebDriver driver, By by,String input) {
		driver.findElement(by).sendKeys(input);
	}
	public void clickButton(WebDriver driver,Keys key) {
		Actions actions=new Actions(driver);
		actions.sendKeys(key).build().perform();
	}
	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
}
