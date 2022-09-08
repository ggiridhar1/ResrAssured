import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Assaignment {
@Test
public void assaignment1() {
	JSONObject jsonOb = new JSONObject();
	jsonOb.put("id", 0);
	jsonOb.put("petId", 0);
	jsonOb.put("quantity", 0);
	jsonOb.put("shipDate","2022-09-06T10:53:59.345Z" );
	jsonOb.put("status", "placed");
	jsonOb.put("complete", true);

	given()
	.body(jsonOb)
	.contentType(ContentType.JSON)
	.when()
	.post("https://petstore.swagger.io/v2/swagger.json/")
	.then()
	.assertThat().statusCode(200).log().all();
}
}
