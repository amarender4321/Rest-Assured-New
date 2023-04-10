package DataProvider;

import PojoClass.CreateProject;
import genericLibraries.JavaLibrary;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider ="getData")
	public void dataTest(String createdBy,String projectName,String staus,int teamSize) {
		JavaLibrary jlb = new JavaLibrary();
		CreateProject obj = new CreateProject( createdBy, projectName+jlb.getRandomNum(), staus, teamSize);
	
	
		given().body(obj).contentType(ContentType.JSON)
		.when().post("http://localhost:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	
	}

@org.testng.annotations.DataProvider(name="getData")
public Object[][] data(){
	Object[][] data = new Object[3][4];
	
	
	data[0][0] ="gopi";
	data[0][1]= "hp";
	data[0][2]= "starting";
	data[0][3] =24;
	
	data[1][0] ="naveen";
	data[1][1]= "poco";
	data[1][2]= "on";
	data[1][3] =16;
	

	data[2][0] ="varsha";
	data[2][1]= "mac";
	data[2][2]= "stared";
	data[2][3]= 66;
	
	return data;
	
}
}
