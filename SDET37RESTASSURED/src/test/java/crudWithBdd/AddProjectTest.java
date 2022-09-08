package crudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
	@Test
public void Create() {
	JSONObject jsonOB = new JSONObject();
	jsonOB.put("createdBy", "Ganesh");
	jsonOB.put("projectName", "apI4");
	jsonOB.put("status", "completed");
	jsonOB.put("teamSize", 30);
	
	given()
	.contentType(ContentType.JSON)
	.body(jsonOB)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().contentType(ContentType.JSON).statusCode(201)
	.log().all();
	}
}
