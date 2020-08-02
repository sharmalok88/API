package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.responseValidation.responseDataValidation;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class getRequestTC {

	@Test
	public void getRequestUsingEndpoint() throws IOException {
		Properties pr = propertiesFileLoad.propertyFile();
		
		httpMethods http = new httpMethods(pr);
		Response res = http.getRequest("Employee_URI",postRequestTC.id);
		
		responseStatusCodeVaidation.responseStatusCodeValidate(res, 200);
		responseDataValidation.responseDataValidate(res, "Sharma", "lastName");
		//System.out.println(res.statusCode());
		System.out.println("Get request Body Data with endpoint");
		System.out.println(res.asString());
	}
}

