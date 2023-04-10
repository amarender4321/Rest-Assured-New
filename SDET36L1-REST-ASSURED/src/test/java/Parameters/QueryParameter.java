package Parameters;

import  static io.restassured.RestAssured.*;

public class QueryParameter {
	
	
	public void queryParameter() {
		//pre requties
		baseURI="https://reqres.in";
		
	//	pre condition
		given()
		.queryParam("page", 3)
		
		//actions
		.when()
		.get("/api/users")
		
		//post conditions
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
	}

}
