package differentWaysPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post4file {
@Test
public void PostViaFile() 
{
	File file = new File("./src/test/resources/1234.json");
	
	baseURI = "http://localhost";
	port = 8084;
	
	given()
	.body(file)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.assertThat().statusCode(201)
	.log().all();
}
}
