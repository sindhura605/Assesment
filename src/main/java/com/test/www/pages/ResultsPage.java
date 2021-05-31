package com.test.www.pages;

import org.junit.jupiter.api.Assertions;

import com.test.www.framework.BaseTest;

public class ResultsPage extends BaseTest{
	public void validateGoogleResults(String expectedTitle) {
		String actualTitle=getTitle(driver);
		Assertions.assertEquals(true, actualTitle.contains(expectedTitle),"Navigated to incorrect page");
	}

}
