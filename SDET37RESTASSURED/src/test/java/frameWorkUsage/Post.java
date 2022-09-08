package frameWorkUsage;

import org.testng.annotations.Test;

import genricLIbarary.BaseApi;
import genricLIbarary.DataBaseUtility;
import genricLIbarary.EndPointLibrary;
import genricLIbarary.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassSerialisationAndDeserialisation.Project;

import static io.restassured.RestAssured.*;

public class Post extends BaseApi {
@Test
public void postrequest() {
	baseURI="http://localhost";
	port=8084;
	Project project = new Project("v.s.giridhar", "project123456", "Created", 30);
	Response response = given()
	.body(project)
	.contentType(ContentType.JSON)
	.when()
	.post(EndPointLibrary.createProject);
	response.then()
	.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
	
	
	//dblib.execuiteQuery("select * from project", 1, )
	
}
}
