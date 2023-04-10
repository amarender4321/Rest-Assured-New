package crudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DeleteProject {

	@Test
	public void deleteProject() {
		//Step 1: Create Prerequities
				//STep 2: Perform Action
	Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_806");
		
		//Step3: validate
	resp.then().log().all();
	int actStatus = resp.getStatusCode();
	Assert.assertEquals(actStatus, 204);
	}
}
