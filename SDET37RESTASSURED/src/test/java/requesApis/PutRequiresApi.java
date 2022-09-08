package requesApis;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutRequiresApi {
@Test
public void PutReqiresApi() {
 JSONObject jsonOB = new JSONObject();
 jsonOB.put("name", "morpheus");
 jsonOB.put("job", "zion resident");
 
 given()
 .body(jsonOB)
 .contentType(ContentType.JSON)
 .when()
 .put("https://reqres.in/api/users/2")
 .then()
 .contentType(ContentType.JSON).statusCode(200)
 .log().all();
 
 
}
}
