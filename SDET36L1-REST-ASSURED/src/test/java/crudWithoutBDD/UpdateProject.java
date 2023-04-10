package crudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericLibraries.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	
	@Test
	public void updateTest() {

		//Step1:preconditions
		JavaLibrary rn= new JavaLibrary();
		JSONObject json = new 	JSONObject();
		json.put("createdBy", "Surender");
		json.put("projectName", "samsen"+rn.getRandomNum());
		json.put("status", "yea!-going");
		json.put("teamSize", 22);
		
	RequestSpecification spec = RestAssured.given();
	spec.body(json);
	spec.contentType(ContentType.JSON);
	
	//Step-2:excute actions
	
	Response resp = spec.put("http://localhost:8084/projects/TY_PROJ_818");
	
	
	//step-validation
	resp.then().assertThat().statusCode(200).log().all();
	}

}
