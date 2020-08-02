package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.responseValidation.responseDataValidation;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class getRequestUsingQuery {

	@Test
	public void getRequestUsingQueryParameter() throws IOException {
		Properties pr = propertiesFileLoad.propertyFile();
		
		httpMethods http = new httpMethods(pr);
		Response res = http.getRequestUsingQuery("Employee_URI","firstName", postRequestTC.firstName);
		
		responseStatusCodeVaidation.responseStatusCodeValidate(res, 200);
		responseDataValidation.responseDataValidate(res, "Sharma", "lastName");
		//System.out.println(res.statusCode());
		System.out.println("Get request Body Data for query paramneter");
		System.out.println(res.asString());
	}
}
