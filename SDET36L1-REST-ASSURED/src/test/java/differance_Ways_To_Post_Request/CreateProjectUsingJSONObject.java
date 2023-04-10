package differance_Ways_To_Post_Request;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONObject {
	
	public void createProjectUsingJSONObject() {
		
		JSONObject jsobj = new 	JSONObject();
		
		jsobj.put("createdBy", "amar");
		jsobj.put("projectName", "mahupe");
		jsobj.put("status", "complete");
		jsobj.put("teamSize", 44);

baseURI ="http://localhost";
port=8084;

given()
.body(jsobj)
.contentType(ContentType.JSON)

.when()
.post("/add/Project")

.then()
.assertThat()
.statusCode(201)
.log().all();

	}

}
