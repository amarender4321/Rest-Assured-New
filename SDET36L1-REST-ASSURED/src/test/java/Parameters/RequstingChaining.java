package Parameters;



import org.testng.annotations.Test;

import PojoClass.CreateProject;
import genericLibraries.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class RequstingChaining {
	@Test
	public void requestChain() {
		JavaLibrary jlb =new JavaLibrary();
		CreateProject obj = new CreateProject("amar", "sesam22"+jlb.getRandomNum(), "complt", 88);

		//pre condition
		baseURI="http://localhost";
		port=8084;

		//create project
		Response rsp = given().body(obj)
				.contentType(ContentType.JSON)
				
				.when()
				.post("/addProject");

		//capture the project id
		String  pId = rsp.jsonPath().get("projectId");
		System.out.println(pId);
		rsp
		.then()
		.log()
		.all();

		//Create a get request and pass proID as path parameter
		given()
		.pathParam("pid",pId )
		
		.when()
		.get("/projects/{pid}")
		
		.then()
		.assertThat().statusCode(200).log().all();
	}

}
