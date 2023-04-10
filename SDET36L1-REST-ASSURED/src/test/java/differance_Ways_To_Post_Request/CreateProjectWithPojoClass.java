package differance_Ways_To_Post_Request;

import org.testng.annotations.Test;

import PojoClass.CreateProject;
import genericLibraries.JavaLibrary;
import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class CreateProjectWithPojoClass {
	
	@Test
	public void createProjectTest() {
		JavaLibrary jlb =new JavaLibrary();
		
		CreateProject proj =new CreateProject("harsha","amdocs"+jlb.getRandomNum(),"createdBy",6);
	
		given()
		.body(proj)
	.contentType(ContentType.JSON)
	
	.when()
	.post("http://localhost:8084/addProject")
	
	.then()
	.assertThat()
	.statusCode(201)
	.log().all();
		
		
	}

}
