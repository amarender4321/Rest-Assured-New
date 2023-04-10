package Validation;

import static  io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class ResponseTimeValidation {
	
	public void responseTimeValidation() {
		
		//pre requisites
	baseURI ="http://localhost";
	port =8084;
	
	//action
	when()
	.get("/projects")             //TY_PROJ_814 use this projectId end point also work
	
	
	//validition
	.then()
	.assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS)
	.log().all();
	
	}
	

}
