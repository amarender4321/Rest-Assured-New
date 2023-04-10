package differance_Ways_To_Post_Request;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class CreateProjectUsingHashMap {
	
	@Test
public void createProjectUsingHashMap(){
		baseURI = "http://localhost";
		port = 8084;
		 
		
		//Step 1: create pre requisites 
		
		JSONObject jsobj = new 	JSONObject();
		jsobj.put("createdBy", "Chandan");
		jsobj.put("projectName", "Sony ");
		jsobj.put("status", "Created");
		jsobj.put("teamSize", 4);
		
		given()
		 .body(jsobj)
		 .contentType(ContentType.JSON)
		 
		.when()
		 .post("/addProject")
		 
		.then()
		 .assertThat().statusCode(201)
		 .log().all();
	 }
}
