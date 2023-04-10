package crudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetAllProjects {

@Test
public void getAllProjectsTest() {
	 //Step 1: Create a pre requisite
	//Step 2: Perform the actiomn
	Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_813");  //if here remove project id get more objects
	
	//Step 3: Provide Validation
	resp.then().log().all();
	int actualStatus = resp.statusCode();
	Assert.assertEquals(200, actualStatus);
	
}
}