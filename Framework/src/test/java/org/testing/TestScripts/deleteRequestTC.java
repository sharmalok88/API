package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class deleteRequestTC {

	@Test
	public void deleteRequest() throws IOException
	{
		Properties pr = propertiesFileLoad.propertyFile();
		httpMethods http = new httpMethods(pr);
		
		Response res = http.deleteRequest("Employee_URI", postRequestTC.id);
		responseStatusCodeVaidation.responseStatusCodeValidate(res, 200);
		
	}
	
}
