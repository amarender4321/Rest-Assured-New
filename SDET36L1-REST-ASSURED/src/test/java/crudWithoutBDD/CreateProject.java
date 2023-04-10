package crudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericLibraries.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	
	@Test
	public void createProjectTest() {
		
		//Step1:preconditions
		JavaLibrary rn= new JavaLibrary();
		JSONObject json = new 	JSONObject();
		json.put("createdBy", "Amarender");
		json.put("projectName", "simson"+rn.getRandomNum());
		json.put("status", "on-going");
		json.put("teamSize", 16);
		
	RequestSpecification spec = RestAssured.given();
	spec.body(json);
	spec.contentType(ContentType.JSON);
		
		//Step2:execution
	
	Response resp = spec.post("http://localhost:8084/addProject");
	
	
		//Step3:validation
	resp.then().assertThat().statusCode(201).log().all();
	}

}
