package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.httpMethods;
import org.testing.Utilities.jsonFileRead;
import org.testing.Utilities.jsonHandling;
import org.testing.Utilities.propertiesFileLoad;
import org.testing.responseValidation.responseDataValidation;
import org.testing.responseValidation.responseStatusCodeVaidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class put_Multiple {

	@Test
	public void PutRequestMul() throws IOException
	{
		//System.out.println("Welcome");
		//String body = jsonFileRead.bodyDataRead("../Framework/src/test/java/org/testing/payloadData/quizBody.json");
		//Properties pr = propertiesFileLoad.propertyFile();
	//System.out.println("body is"+body);
		//httpMethods http = new httpMethods(pr);
		//jsonHandling.jsonHandlingok(body, "sport", "TestValue");
		
		
/*		Response res = http.putRequest(body.toString(), "Employee_URI", postRequestTC.id);
		//System.out.println(resp.statusCode());
		responseStatusCodeVaidation.responseStatusCodeValidate(res, 200);
		responseDataValidation.responseDataValidate(res, "RishSharma", "firstName");
		System.out.println("put request response");
		System.out.println(res.asString());*/
		

	}
}
