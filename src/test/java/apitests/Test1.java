package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {

	public static void main(String[] args) 
	{
		//1. make a request
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		//2. submit request via http method to get response
		Response res=RestAssured.get();
		//Analyze response
		int x=res.getStatusCode();
		System.out.println(x);
		String y=res.getHeaders().getValue("Content-Type");
		System.out.println(y);
		String z=res.getBody().asString();
		System.out.println(z);
		
	}

}
