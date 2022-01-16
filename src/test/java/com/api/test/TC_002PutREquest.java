package com.api.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_002PutREquest {
	@Test
	public void postRequest() {
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httpRequest=RestAssured.given();
		
		//Sending Request along with payload
		JSONObject requestParams=new JSONObject();
		requestParams.put("name", "Bryant");
		requestParams.put("job", "BA");
		
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		Response response=httpRequest.request(Method.POST,"/users");
		
		String responseBody = response.getBody().asString(); 
		int StatusCode=response.getStatusCode();
		Assert.assertEquals(StatusCode,201);
		
		
	}

}
