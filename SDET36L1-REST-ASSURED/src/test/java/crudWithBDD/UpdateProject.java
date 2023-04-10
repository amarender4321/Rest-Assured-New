package crudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericLibraries.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	
	@Test
	public void updateProject(){
		JavaLibrary rn= new JavaLibrary();
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "amarender");
		jobj.put("projectName", "synika"+rn.getRandomNum());
		jobj.put("status", "copmleting");
		jobj.put("teamSize", 24);
		
		baseURI ="http://localhost";
		port =8084;
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()   //Step2: perform action
		.put("/projects/TY_PROJ_818")
		
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		
		
	}

}
