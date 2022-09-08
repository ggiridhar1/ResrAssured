package pathparam;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Get {
@Test
public void get() {
	baseURI="http://localhost";
	port=8084;
	
	given()
	.pathParam("getpath", "TY_PROJ_612")
	.when()
	.get("/projects/{getpath}")
	.then()
	.contentType(ContentType.JSON)
	.statusCode(200)
	.log().all();
	
}
}
