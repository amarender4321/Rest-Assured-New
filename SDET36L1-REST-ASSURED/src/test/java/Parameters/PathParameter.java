package Parameters;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class PathParameter {
	
	@Test
	public void pathParameter() {
		
		
		//pre requties
		baseURI="http://localhost";
		port=8084;
		
		
		//pre conditions
		given()
		.pathParam("pid","TY_PROJ_2604" )
		
		//actions conditions
		.when()
		.get("/projects/{pid}")
		

		//Validations
		
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
		
		
		
		
		
	}

}
