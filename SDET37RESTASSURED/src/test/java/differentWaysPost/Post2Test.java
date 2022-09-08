package differentWaysPost;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.*;

public class Post2Test {
	
@Test
public void TocreateaPost() {
JSONObject jsonOB = new JSONObject();
jsonOB.put("createdBy", "V.S.GIRIDHAR");
jsonOB.put("projectName", "RestAssured");
jsonOB.put("status", "completed");
jsonOB.put("teamSize", 30);

given()
 .contentType(ContentType.JSON).body(jsonOB)
.when()
 .post("http://localhost:8084/addProject")
.then()
 .assertThat().contentType(ContentType.JSON).statusCode(201)
.log().all();
}
}