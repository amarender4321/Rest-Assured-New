package crudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericLibraries.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject {
	
	@Test
	public void createProject() {
		JavaLibrary rn= new JavaLibrary();
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy", "amar");
	jobj.put("projectName", "symon"+rn.getRandomNum());
	jobj.put("status", "copmleted");
	jobj.put("teamSize", 28);
	
	baseURI="http://localhost";
	port=8084;
	
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	
	.when()   //Step2: perform action
	.post("/addProject")
	
	.then()
	.assertThat()
	.statusCode(201)
	.log()
	.all();
	
		
	}

}
