package differentWaysPost;

import java.util.HashMap;

import org.apache.http.impl.client.TargetAuthenticationStrategy;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class Post3HashMap {
@Test
public void PostUsingHashMap() {
	HashMap map = new HashMap();
	map.put("createdBy", "durshan");
	map.put("projectName", "wiki");
	map.put("status", "created");
	map.put("teamSize", 30);
	
	baseURI="http://localhost";
	port=8084;
			
	given()
	.body(map)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.assertThat().statusCode(201)
	.log().all();
	
	
 
}
}
