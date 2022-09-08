package requesApis;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetRequesApi {
	@Test
	public void GetReuesApi() {
		when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.contentType(ContentType.JSON).statusCode(200)
		.log().all();
		
	}

}
