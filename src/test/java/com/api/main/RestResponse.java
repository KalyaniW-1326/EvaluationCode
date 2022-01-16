package com.api.main;

import io.restassured.response.Response;

public class RestResponse<T> implements IRestAPIResponse<T>{
	private T data;
	private Response response;
	private Exception e;

	public RestResponse(Class<T> t, Response response) {
		this.response = response;
	}
	
	public String getContent() {
		return response.getBody().asString();
	}

	public int getStatusCode() {
		return response.getStatusCode();
	}

	public boolean isSuccessful() {
		int code = response.getStatusCode();
		if( code == 200 || code == 201 || code == 202 || code == 203 || code == 204 || code == 205) return true;
		return false;
	}

	public String getStatusDescription() {
		return response.getStatusLine();
	}
	
	public Response getResponse() {
		return response;
	}
	

	public T getBody() {
		try {
			data = (T) response.getBody().as(data.getClass());
		}catch (Exception e) {
			this.e=e;
		}
		return data;
	}

	public Exception getException() {
		return e;
	}

}


