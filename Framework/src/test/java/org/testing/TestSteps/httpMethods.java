package org.testing.TestSteps;

import java.util.Properties;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class httpMethods {

	Properties pr;
	public httpMethods(Properties pr) {
		this.pr = pr;
	}
	
	public Response postRequest(String bodyData, String URI)
	{
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(URI)); 
		
		return res;	
	}
	
	public Response getRequest(String URI,String Endpoint)
	{
		String uri = pr.getProperty(URI)+"/"+Endpoint;
		System.out.println("uri created is : "+uri);
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri); 
		
		return res;	
	}
	
	public Response getRequestUsingQuery(String URI,String Query_Parameter,String Query_Value)
	{
		String uri = pr.getProperty(URI)+"?"+Query_Parameter+"="+Query_Value;
		System.out.println("Query uri created is : "+uri);
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri); 
		
		return res;	
	}
	
	public Response putRequest(String body, String URI,String keyName)
	{
		String uri = pr.getProperty(URI)+"/"+keyName;
		System.out.println("uri created is : "+uri);
		Response res = 
			given()
			.contentType(ContentType.JSON)
			.body(body)
			.when()
			.put(uri); 
		return res;	
	}
	
	public Response deleteRequest(String URI,String Endpoint)
	{
		String uri = pr.getProperty(URI)+"/"+Endpoint;
		System.out.println("Delete uri created is : "+uri);
		Response res = 
			given()
			.contentType(ContentType.JSON)
			.when()
			.delete(uri); 
		return res;	
	}
	
	public Response patchRequest(String body,String URI,String Endpoint)
	{
		String uri = pr.getProperty(URI)+"/"+Endpoint;
		System.out.println("Patch uri created is : "+uri);
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.patch(uri); 
		return res;	
	}
}
