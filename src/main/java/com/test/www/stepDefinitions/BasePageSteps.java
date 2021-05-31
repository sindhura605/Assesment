package com.test.www.stepDefinitions;

import com.test.www.framework.BaseTest;
import com.test.www.pages.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BasePageSteps extends BaseTest{
	@Given("User is in google search page")
	public void user_is_in_google_search_page() {
		openBrowser(prop.getProperty("browser"));
		BasePage basepage=new BasePage();
		basepage.navigateToHomePage();
	}
	@Then("Close the browser")
	public void closeBrowser() {
		driver.quit();
	}

}
