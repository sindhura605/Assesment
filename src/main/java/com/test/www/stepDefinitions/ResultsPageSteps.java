package com.test.www.stepDefinitions;

import com.test.www.framework.BaseTest;
import com.test.www.pages.ResultsPage;

import io.cucumber.java.en.Then;

public class ResultsPageSteps extends  BaseTest{
	@Then("Tilte of the page should contains {string}")
	public void tilte_of_the_page_should_contains(String expectedTitle) {
	   ResultsPage resultsPage=new ResultsPage();
	   resultsPage.validateGoogleResults(expectedTitle);
	}


}
