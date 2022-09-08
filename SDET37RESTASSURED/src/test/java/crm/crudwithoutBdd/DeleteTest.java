package crm.crudwithoutBdd;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteTest {
public void deletepurticularProject() {
	Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1803");
	ValidatableResponse validate = response.then();
	validate.assertThat().statusCode(204);
	validate.log().all();
}
}
