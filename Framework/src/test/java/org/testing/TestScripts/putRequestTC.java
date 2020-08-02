package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.jsonFileRead;
import org.testing.Utilities.jsonVariableReplacement;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.Utilities.responseExtractionUsingJSONPath;
import org.testing.responseValidation.responseDataValidation;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class putRequestTC {
	@Test
		public void PutRequest() throws IOException
		{
		System.out.println(postRequestTC.res.asString());
			JSONObject body = new JSONObject(postRequestTC.res.asString());
			body = body.put("firstName", "RishSharma");

			Properties pr = propertiesFileLoad.propertyFile();
			System.out.println("body : "+body);
			
			httpMethods http = new httpMethods(pr);
			Response res = http.putRequest(body.toString(), "Employee_URI", postRequestTC.id);
			//System.out.println(resp.statusCode());
			responseStatusCodeVaidation.responseStatusCodeValidate(res, 200);
			responseDataValidation.responseDataValidate(res, "RishSharma", "firstName");
			System.out.println("put request response");
			System.out.println(res.asString());
			

		}
	
}
