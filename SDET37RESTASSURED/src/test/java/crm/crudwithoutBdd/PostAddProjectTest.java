package crm.crudwithoutBdd;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostAddProjectTest {
public void createProject() {
JSONObject jsonOB = new JSONObject();
jsonOB.put("createdBy", "arun");
jsonOB.put("projectName", "GProject1");
jsonOB.put("status", "Created");
jsonOB.put("teamSize", 20);

RequestSpecification reqspec = RestAssured.given();
reqspec.body(jsonOB);
reqspec.contentType(ContentType.JSON);

Response response = reqspec.post("http://localhost:8084/addProject");
ValidatableResponse validate = response.then();
validate.assertThat().contentType(ContentType.JSON);
validate.assertThat().statusCode(201);
validate.log().all();
}
}
