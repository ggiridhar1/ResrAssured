package validation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Timevalidation {
@Test
public void Timevalidation() {
	JSONObject jsonOB = new JSONObject();
	jsonOB.put("createdBy", "Ganesh");
	jsonOB.put("projectName", "apI411");
	jsonOB.put("status", "completed");
	jsonOB.put("teamSize", 30);
	
	given()
	.contentType(ContentType.JSON)
	.body(jsonOB)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	//it will not show show the time if test case is pass
	.assertThat().time(Matchers.lessThan(2000L), TimeUnit.MILLISECONDS)
	.log().all();
	
	500101011566027
	CIUB0000204
}
}
