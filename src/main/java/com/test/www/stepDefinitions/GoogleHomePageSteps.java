package com.test.www.stepDefinitions;

import com.test.www.pages.GoogleHomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleHomePageSteps {
	@When("User provided {string}")
	public void user_provided(String searchKeyword) {
		GoogleHomePage googleHomePage=new GoogleHomePage();
		googleHomePage.searchProduct(searchKeyword);
	}

}
