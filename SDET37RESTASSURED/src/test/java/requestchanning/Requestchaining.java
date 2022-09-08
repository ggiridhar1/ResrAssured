package requestchanning;

import org.testng.annotations.Test;

import genricLIbarary.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClassSerialisationAndDeserialisation.Project;

public class Requestchaining {
@Test
public void postAndGet() {
JavaUtility jlib = new JavaUtility();	
Project pro = new Project("ME", "world"+jlib.getRandomNum(), "completed", 10);
baseURI="http://localhost";
port=8084;

Response respo = given()
.body(pro)
.contentType(ContentType.JSON)
.when()
.post("/addProject");

String proId = respo.jsonPath().get("projectId");
System.out.println(proId);
respo.then().log().all();

given()
.pathParam("pro", proId)
.when()
.get("/projects/{pro}")
.then()
.assertThat().statusCode(200).log().all();

}
}
