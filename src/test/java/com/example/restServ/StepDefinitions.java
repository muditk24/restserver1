package com.example.restServ;

import static org.junit.Assert.assertEquals;

import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	String url=null;
	double result=0;

	@Given("rest api {string}")
	public void restApi(String url) {
	    this.url=url;
	}

	@When("I invoke api")
	public void iInvokeApi() {
		  RestTemplate restapi=new RestTemplate();
		    result=restapi.getForObject(url,Double.class);
	}

	@Then("expected result {double}")
	public void expectedResult(Double expectedResult) {
	 assertEquals(expectedResult,result,0.01);
	}



}
