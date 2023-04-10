package genericLibraries;

import org.json.simple.JSONObject;

public class UpdateTest {
	
	public void updateTest() {
		//Step1:preconditions
				JavaLibrary rn= new JavaLibrary();
				JSONObject json = new 	JSONObject();
				json.put("createdBy", "Amarender");
				json.put("projectName", "simson"+rn.getRandomNum());
				json.put("status", "on-going");
				json.put("teamSize", 16);
	}

}
