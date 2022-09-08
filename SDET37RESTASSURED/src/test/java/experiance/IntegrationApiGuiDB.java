package experiance;

import org.testng.annotations.Test;

import genricLIbarary.BaseApi;
import genricLIbarary.EndPointLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassSerialisationAndDeserialisation.Project;

import static io.restassured.RestAssured.*;

public class IntegrationApiGuiDB extends BaseApi{

	@Test
	public void apiGuiDb() {
		baseURI="http://localhost";
		port=8084;
		
		Project project = new Project("lady", "NYKA"+javlib, "created", 30);
		Response respo = given()
		.body(project)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointLibrary.createProject);
		
		respo.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}
