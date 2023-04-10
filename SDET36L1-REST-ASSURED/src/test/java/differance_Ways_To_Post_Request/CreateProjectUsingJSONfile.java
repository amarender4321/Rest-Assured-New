package differance_Ways_To_Post_Request;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONfile {
	@Test
public void	 createProjectUsingJSONfile() {
	
	//Step-1:create pre requisties
	File file =new File("./src/test/resources/api2.json");
	baseURI ="http://localhost";
	port =8084;
	
	given()
	.body(file)
	.contentType(ContentType.JSON)
	
	//step 2:perform Action
	.when()    
	.post("/addProject")
	
	 //step 3:validation
	.then()    
	.assertThat().statusCode(201)
	.log().all();  
		
}
}
