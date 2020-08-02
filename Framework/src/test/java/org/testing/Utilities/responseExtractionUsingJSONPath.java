package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class responseExtractionUsingJSONPath {
	
	public static String responseExtaction(String jsonPath, Response res)
	{
		return res.jsonPath().get(jsonPath);
	}

}
