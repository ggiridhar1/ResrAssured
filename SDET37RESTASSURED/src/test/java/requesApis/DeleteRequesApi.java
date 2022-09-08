package requesApis;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteRequesApi {
@Test
public void DeleteRequesApi() {
	delete("https://reqres.in/api/users/2")
	.then()
	.statusCode(204)
	.log().all();
}
}
