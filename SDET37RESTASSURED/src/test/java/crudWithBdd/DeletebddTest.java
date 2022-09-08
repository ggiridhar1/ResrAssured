package crudWithBdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class DeletebddTest {
@Test
public void ToDeleteProject() {
delete("http://localhost:8084/projects/TY_PROJ_616")
.then()
.statusCode(204)
.log().all();
}
}