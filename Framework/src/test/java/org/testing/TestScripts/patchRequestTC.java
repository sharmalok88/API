package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.jsonFileRead;
import org.testing.Utilities.jsonVariableReplacement;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.responseValidation.responseDataValidation;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class patchRequestTC {
	@Test
	public void patchRequest() throws IOException
	{
		JSONObject json = new JSONObject();
		String body=json.put("firstName", "Patch_try").toString();
		// = postRequestTC.res.asString();
		Properties pr = propertiesFileLoad.propertyFile();
		
		httpMethods http = new httpMethods(pr);
		Response res= http.patchRequest(body, "Employee_URI", "-1903578628");
		responseStatusCodeVaidation.responseStatusCodeValidate(res, 200);
		responseDataValidation.responseDataValidate(res, "Patch_try", "firstName");
	}
}
