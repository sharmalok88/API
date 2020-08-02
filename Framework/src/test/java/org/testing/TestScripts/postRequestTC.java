package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.jsonFileRead;
import org.testing.Utilities.jsonVariableReplacement;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.Utilities.responseExtractionUsingJSONPath;
import org.testing.responseValidation.responseDataValidation;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class postRequestTC {
	static String id;
	static String firstName;
	 static Response res;
	 @Test
	 
	public void postRequest() throws IOException {
		System.out.println("POST");
		 String body = jsonFileRead.bodyDataRead("../Framework/src/test/java/org/testing/payloadData/body.json");
		Random r = new Random();
		Integer v = r.nextInt();
		body = jsonVariableReplacement.jsonVariable(body, "id", v.toString());
		//System.out.println(body);
		Properties pr = propertiesFileLoad.propertyFile();
		
		httpMethods http = new httpMethods(pr);
		res = http.postRequest(body, "Employee_URI");
		responseStatusCodeVaidation.responseStatusCodeValidate(res, 201);
		responseDataValidation.responseDataValidate(res, "Sharma", "lastName");
		//System.out.println(res.statusCode());
		System.out.println("Post request data");
		System.out.println(res.asString());
		id=responseExtractionUsingJSONPath.responseExtaction("id", res);
		firstName = responseExtractionUsingJSONPath.responseExtaction("firstName", res);
	}


}
