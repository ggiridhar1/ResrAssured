package requestchanning;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetAndDelete {
@Test
public void getAndDelete() {
	baseURI="http://localhost";
	port=8084;
Response response = when()
.get("/projects/TY_PROJ_1616");

String proid = response.jsonPath().get("projectId");//imp
System.out.println(proid);
response.then().log().all();

given()
.pathParam("pro", proid)
.when()
.delete("/projects/{pro}")
.then()
.assertThat().statusCode(204).log().all();
}
}
