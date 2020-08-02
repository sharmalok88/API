package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonFileRead {

	public static String bodyDataRead(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		JSONTokener js = new JSONTokener(fi);
		JSONObject bodyData = new JSONObject(js);
		return bodyData.toString();
	}
}
