package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test3 
{
	public static void main(String[] args) 
	{
		//1. make a request
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		//2. submit request via http method to get response
		Response res=RestAssured.get();
		//3 analyze the response
		//3.1 status code
		int a=res.getStatusCode();
		System.out.println(a);
		if(a==200) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		//3.2 header
		String b=res.getHeaders().getValue("Content-Type");
		b=b.toLowerCase();
		System.out.println(b);
		if(b.contains("josn")) {
			System.out.println("Body in json formart");
		}
		else if(b.contains("xml")) {
			System.out.println("Body in xml formart");
		}
		else if(b.contains("html")) {
			System.out.println("Body in html formart");
		}
		else {
			System.out.println("Body in plan text");
		}
		//3.3 body
		String c=res.getBody().asString();
		System.out.println(c);		
	}
}
