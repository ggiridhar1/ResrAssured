package atontication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2_0two {
@Test
public void auth2_0two() {
  Response respo = given()
.formParam("client_id", "tysssdet37")
.formParam("client secret", "18f68f50debaf8e7be5032a11557f643")
.formParam("grant_type", "client_credentials")
.formParam("redirect_url", "https://facebook.com")
.formParam("code", "3736")

.when()
.post("http://coop.apps.symfonycasts.com/token");

 String token = respo.jsonPath().get("access_token");
 
 given()
 .auth().oauth2(token)
 .pathParam("USER_ID", 3736)

 .when()
 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed");
 
 
 
}
}
