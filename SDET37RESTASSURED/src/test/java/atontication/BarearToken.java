package atontication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BarearToken {
@Test
public void github() {
	JSONObject jObj = new JSONObject();
	jObj.put("name", "anyRepoName");
	
given()
.auth().oauth2("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")

.when()
.post("https://api.github.com/user/repos")

.then().log().all();
}
}
