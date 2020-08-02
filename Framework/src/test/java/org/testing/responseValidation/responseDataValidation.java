package org.testing.responseValidation;

import com.jayway.restassured.response.Response;

public class responseDataValidation {
	
	public static void responseDataValidate(Response res, String expected_data, String jsonPath)
	{
		String actual_Data  = res.jsonPath().getString(jsonPath);
		
		if(actual_Data.equals(expected_data))
		{
			System.out.println("Response data matching with Expected data");
		}
		else
		{
			System.out.println("Response data not matching with Expected data");
		}
	}

}
