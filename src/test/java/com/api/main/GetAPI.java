package com.api.main;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPI {
	private static final String BASE_URL="https://reqres.in/api/users?page=2";
	public static IRestAPIResponse<> getusers(){
		RestAssured.baseURI="BASE_URL";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get()
}
}
