package differentWaysPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassSerialisationAndDeserialisation.Project;

public class Post1Test {
@Test
public void addProjectsToPojoClass() {
	Project project = new Project("bill","microsoft","created",30);
	given()
	.body(project).contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201).contentType(ContentType.JSON)
	.log().all();
}
}
