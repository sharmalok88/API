package org.testing.Utilities;

import static com.jayway.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class jsonHandling {

	public static void jsonHandlingok() throws FileNotFoundException
	{	
		
	String body = jsonFileRead.bodyDataRead("../Framework/src/test/java/org/testing/payloadData/quizBody.json");
	
	System.out.println("body is"+body);
		
	
		
		
			JSONObject json = new JSONObject(body.toString()); 
			int length = json.length();
			System.out.println("length  : "+length);
			for(int i=0;i<length;i++)
			{
			Set<String> allkeys = json.keySet();
			System.out.println("post set string");
			System.out.println(allkeys);
			
			for(String s: allkeys)
			{
				if(s.contains("options"))
				{
					System.out.println(json.get(s));
					
				}
			}}
	}
}

