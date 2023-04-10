package Validation;

import  static io.restassured.RestAssured.*;

import java.util.List;

import org.junit.Assert;

import io.restassured.response.Response;

public class DynamicResponseValidation {

	public void dynamicResponseValidation() {

		String expData ="TY_PROJ_605";
		baseURI ="http://localhost";
		port =8084;

		// action
		Response resp = when().get("/projects");

		//validation

		boolean flag = false;
		List<String>pids = resp.jsonPath().get("projectId");
		for(String projIds:pids) {
			if(projIds.equalsIgnoreCase(expData)) {
				flag =true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("test case pass");
		resp.then().log().all();


	}


}
