package crudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ChangingProjectDetailsBdd {
@Test
public void UpdateOnProjects() {
	JSONObject jsonOB = new JSONObject();
	jsonOB.put("createdBy", "girid");
	jsonOB.put("projectName", "ada");
	jsonOB.put("status", "completed");
	jsonOB.put("teamSize", 30);
	
	//TY_PROJ_616
	given()
	.body(jsonOB)
	.contentType(ContentType.JSON)
	.when()
	.put("http://localhost:8084/projects/TY_PROJ_616")
	.then()
	.assertThat().contentType(ContentType.JSON)
	.statusCode(200)
	.log().all();
}
}
