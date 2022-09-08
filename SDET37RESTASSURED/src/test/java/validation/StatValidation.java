package validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StatValidation {
@Test
public void staticval() {
	//preresusites
	String expDataString="TY_PROJ_002";
	baseURI="http://localhost";
	port=8084;
	
	//action
	Response repo = when()
	.get("/projects");
	
	//validation
	String actData = repo.jsonPath().get("[1].projectId");
	Assert.assertEquals(actData, expDataString);
	System.out.println("data is verified");
	
	repo.then().log().all();
	}
}
