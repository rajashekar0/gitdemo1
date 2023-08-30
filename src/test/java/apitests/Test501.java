package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test501 
{
	public static void main(String[] args) 
	{
		//Create http request with all details
		RequestSpecification req=RestAssured.given();
		req.baseUri("https://www.google.co.in"); //protocal with domain name
		req.basePath("search"); //resource hierarchy
		req.queryParam("q", "gold rate in hyderabad");
		req.given().log().all();
		//submit request
		Response res=req.get();
		//display whole response
		res.then().log().all();
		//display out out
		System.out.println("happy ending");
	}

}
