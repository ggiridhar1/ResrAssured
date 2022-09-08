package crm.crudwithoutBdd;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ChangingProjectDetailsTest {
public void ChangingProjectDetails() {
	
	JSONObject jsonOB = new JSONObject();
	jsonOB.put("CreatedBy", "Arun");
	jsonOB.put("projectName", "Tyss");
	jsonOB.put("status", "Created");
	jsonOB.put("teamsize", 25);
	
	RequestSpecification reqspec = RestAssured.given();
	reqspec.body(jsonOB);
	reqspec.contentType(ContentType.JSON);
	
	Response response = reqspec.put("http://localhost:8084/projects/TY_PROJ_1803");
	
	ValidatableResponse validate = response.then();
	validate.assertThat().contentType(ContentType.JSON);
	validate.assertThat().statusCode(201);
	validate.log().all();
}
}
