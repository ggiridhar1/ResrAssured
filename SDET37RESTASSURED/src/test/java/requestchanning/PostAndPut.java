
package requestchanning;

import org.testng.annotations.Test;

import genricLIbarary.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClassSerialisationAndDeserialisation.Project;

public class PostAndPut {
@Test
public void postAndPut() {
	JavaUtility jlib = new JavaUtility();
	Project project = new Project("hello", "hushpuppy"+jlib.getRandomNum(), "created", 30);
	baseURI="http://localhost";
	port=8084;
	
	Response respo = given()
	.body(project)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	String proId=respo.jsonPath().get("projectId");
	System.out.println(proId);
	respo.then().log().all();
	
	Project proj = new Project("hello", "hash"+jlib.getRandomNum(), "Created", 30);
	
	given()
	.body(proj)
	.contentType(ContentType.JSON)
	.pathParam("pro", proId)
	.when()
	.put("/projects/{pro}")
	.then()
	.assertThat().statusCode(200).log().all();
}
}
