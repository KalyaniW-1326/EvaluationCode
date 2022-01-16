package com.api.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.evaluation.base.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC_001_Get{
	
	  @Test
public void verifyName() {
	  RestAssured.baseURI="https://reqres.in/api/users?page=2"; 
	  //Request object to send the request 
	  RequestSpecification httpRequest=RestAssured.given();
	  //Response object to save the request 
	  Response response=httpRequest.request(Method.GET);
	  int StatusCode=response.getStatusCode(); System.out.println(StatusCode);
	  Assert.assertEquals(StatusCode,200);
	  
	  
	  
	  }
	 
	
	

}
