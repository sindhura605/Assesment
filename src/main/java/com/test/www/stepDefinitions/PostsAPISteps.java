package com.test.www.stepDefinitions;

import org.junit.jupiter.api.Assertions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.www.framework.BaseTest;
import com.test.www.pojos.Post;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PostsAPISteps extends BaseTest {
	Response response;
	String getURL;

	@Given("Set Posts URL for {int}")
	public void set_posts_url_for(Integer id) {
		getURL = prop.getProperty("apiBaseURL")
				+ prop.getProperty("postsEndPoint").replaceAll("<postid>", id.toString());

	}

	@When("Post the request")
	public void post_the_request() {
		response = RestAssured.given().get(getURL);
	}

	@Then("Status code should be {int}")
	public void status_code_should_be(Integer expectedResult) {
		Assertions.assertEquals(expectedResult, response.getStatusCode(),"Navigated to incorrect page");
	}

	@Then("{int} should be displayed in response")
	public void should_be_displayed_in_response(Integer id) throws JsonMappingException, JsonProcessingException {
		ObjectMapper obj=new ObjectMapper();
		Post actualPostValue=obj.readValue(response.getBody().asString(), Post.class);
		Assertions.assertEquals(id, actualPostValue.getId(),"Incorrect Id in reponse");
	}

}
