package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test2 
{

	public static void main(String[] args) 
	{
		//1. Make a request
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		//2.submit request via http method to get response
		Response res=RestAssured.get();
		//3.Analyze response
		String x=res.getStatusLine();
		System.out.println(x);
		String z=res.getBody().asString();
		System.out.println(z);

	}

}
