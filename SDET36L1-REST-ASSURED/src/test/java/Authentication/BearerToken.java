package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.junit.experimental.theories.Theories;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {
	
	@Test
	public void bearerToken() {
		
	baseURI="https://api.github.com";
	JSONObject jobj =new JSONObject();
	jobj.put("name", "sdet36L1-restAssured");
	
	given()
	.auth()
	.oauth2("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")
	.body(jobj)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/user/repos")
	
	.then().log().all();
	}

}
