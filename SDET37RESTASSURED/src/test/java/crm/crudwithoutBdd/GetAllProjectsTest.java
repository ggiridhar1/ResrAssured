package crm.crudwithoutBdd;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {
public void getAllProject()
{
	Response response = RestAssured.get("http://localhost:8084/projects");
	ValidatableResponse validate = response.then();
	validate.assertThat().contentType(ContentType.JSON);
	validate.assertThat().statusCode(200);
	validate.log().all();
	}
}
