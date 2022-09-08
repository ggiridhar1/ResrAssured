package requestchanning;

import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import genricLIbarary.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassSerialisationAndDeserialisation.Project;

import static io.restassured.RestAssured.*;

public class PostAndDelete {
@Test
public void postAndDelete() {
JavaUtility jlib = new JavaUtility();	
Project project = new Project("me", "nyka"+jlib.getRandomNum(), "completed",30);
baseURI="http://localhost";
port=8084;

Response resp = given()
.body(project)
.contentType(ContentType.JSON)
.when()
.post("/addProject");

String proId = resp.jsonPath().get("projectId");
System.out.println(proId);
resp.then().log().all();

given()
.pathParam("projid", proId)
.when()
.delete("/projects/{projid}")
.then()
.assertThat().statusCode(204).log().all();

}
}
