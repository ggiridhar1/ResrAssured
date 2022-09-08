package queryparam;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class list {
@Test
public void reques() {
	baseURI="https://reqres.in/";
	
	given()
	.queryParam("page",2)
	
	.when()
	.get("api/users")
	
	.then()
	.log().all();
}
}
