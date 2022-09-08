package frameWorkUsage;

import org.testng.annotations.Test;

import genricLIbarary.EndPointLibrary;

import static io.restassured.RestAssured.*;

public class Delete {
@Test
public void delete() {
	baseURI="http://localhost";
	port=8084;
	when()
	.delete(EndPointLibrary.deleteProject)
	.then()
	.assertThat().statusCode(204)
	.log().all();
}
}
