package validation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;



public class DynamicValidation {
@Test
public void dynamicValidation() {
	String expected="TY_PROJ_004";
	baseURI="http://localhost";
	port=8084;
	
	Response repo = when().get("/projects");
	
	boolean flag=false;
	List<String> pidsList=repo.jsonPath().get("projectId");
	for (String eachids : pidsList) {
		if (eachids.equalsIgnoreCase(expected)) {
			flag=true;
		}
	}
	Assert.assertTrue(flag);
	System.out.println("Data is validated");
	repo.then().log().all();
}
}
