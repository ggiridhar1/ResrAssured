package requesApis;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequisApi {
@Test
public void postRequesApI() {
	JSONObject jsonOB = new JSONObject();
	jsonOB.put("name", "morpheus");
	jsonOB.put("job", "leader");
	
	given()
	.contentType(ContentType.JSON)
	.body(jsonOB)
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.assertThat().contentType(ContentType.JSON).statusCode(201)
	.log().all();
}
}
