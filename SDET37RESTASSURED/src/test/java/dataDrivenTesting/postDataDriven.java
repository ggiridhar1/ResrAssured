package dataDrivenTesting;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genricLIbarary.ExcelUtility;
import genricLIbarary.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassSerialisationAndDeserialisation.Project;

public class postDataDriven {
	@Test(dataProvider = "databody")
	public void create(String createdBy,String projectName,String status,int teamSize) {
		Project project = new Project(createdBy,projectName,status,teamSize);
		baseURI=("http://localhost");
		port=8084;
		
		given()
		.body(project)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}
	@DataProvider
	public Object[][] databody() throws Throwable{
		JavaUtility ejav = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();
		Object[][] objArr = new Object[4][4];
		objArr[0][0]=elib.getDataFromExcel("restassured", 0, 0);
		objArr[0][1]=elib.getDataFromExcel("restassured", 0, 1)+ejav.getRandomNum();
		objArr[0][2]=elib.getDataFromExcel("restassured", 0, 2);
		objArr[0][3]=Integer.parseInt(elib.getDataFromExcel("restassured", 0, 3));
		
		objArr[1][0]=elib.getDataFromExcel("restassured", 1, 0);
		objArr[1][1]=elib.getDataFromExcel("restassured", 1, 1)+ejav.getRandomNum();
		objArr[1][2]=elib.getDataFromExcel("restassured", 1, 2);
		objArr[1][3]=Integer.parseInt(elib.getDataFromExcel("restassured", 1, 3));
		
		objArr[2][0]=elib.getDataFromExcel("restassured", 2, 0);
		objArr[2][1]=elib.getDataFromExcel("restassured", 2, 1)+ejav.getRandomNum();
		objArr[2][2]=elib.getDataFromExcel("restassured", 2, 2);
		objArr[2][3]=Integer.parseInt(elib.getDataFromExcel("restassured", 2, 3));
		
		objArr[3][0]=elib.getDataFromExcel("restassured", 3, 0);
		objArr[3][1]=elib.getDataFromExcel("restassured", 3, 1)+ejav.getRandomNum();
		objArr[3][2]=elib.getDataFromExcel("restassured", 3, 2);
		objArr[3][3]=Integer.parseInt(elib.getDataFromExcel("restassured", 3, 3));
		
		return objArr;
	}
}
