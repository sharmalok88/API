package org.testing.responseValidation;

import com.jayway.restassured.response.Response;

public class responseStatusCodeVaidation {

	public static void responseStatusCodeValidate(Response res, int expected_StatusCode)
	{
		if((res.statusCode()) == expected_StatusCode)
		{
			System.out.println("Status Code Match");
		}
		else
		{
			System.out.println("Status Code Not Match");
		}		
	}
}
