package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test500 
{
	public static void main(String[] args) 
	{
		//1. make a request
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		//2. submit request via http method via get
		Response res=RestAssured.get("30");
		//3. response body
		String x=res.getBody().asString();
		System.out.println(x);
	}

}
