package com.api.main;

import io.restassured.response.Response;

public interface IRestAPIResponse<T> {
	public T getBody();
	
	public String getContent();
	
	public int getStatusCode();
	
	public boolean isSuccessful();
	
	public String getStatusDescription();
	
	public Response getResponse();
	
	public Exception getException();
}


