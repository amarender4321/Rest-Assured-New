package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import  static io.restassured.RestAssured.*;

public class Oauth2_0 {

	@Test
public void oauthAuthentication() {
		

		//Create a request to generate accesss token 
		
	  Response resp = given()
		.formParam("client_id", "api-36L1")
		.formParam("client_secret", "d3cf1c4a5e9f692274a8a545f5808b58")
		.param("grant_type", "client_credentials")
		.param("redirect_uri", "http://tyss-api.com")
		.param("code", "authorization_code")
		
		
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
	  //  .then().log().all();
	 

	    //Capture the access token from the response of the above request
	 
	String token = resp.jsonPath().get("access_token");
	System.out.println(token);
	
	given()
	.auth().oauth2(token)
	.pathParam("USER_ID", 3826)
	
	.when()
    .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
    
    .then().log().all();
    

	
}
}
