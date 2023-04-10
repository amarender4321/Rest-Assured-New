package Validation;

import  static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticValidationResponse {

	@Test
	public void staticValidationGet() {


		String expData="TY_PROJ_001";
		baseURI ="http://localhost";
		port =8084;

		//action
		Response resp = when().get("/projects");

		//validation

		String actData =resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(actData,expData );
		System.out.println("data is verified");

		resp.then().log().all();
	}

}
