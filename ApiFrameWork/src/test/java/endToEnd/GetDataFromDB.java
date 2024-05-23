package endToEnd;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utility.BaseClass;
import utility.EndPointsLibrary;

public class GetDataFromDB extends BaseClass {

	@Test
	public void test() throws SQLException {
		
		Response rs = given().spec(req).contentType(ContentType.JSON)
				.when().get(EndPointsLibrary.getSingleProject+"TY_PROJ_26410");
		
		String id = ru.getJsonData(rs, "projectId");
		System.out.println(id);	
		rs.then().log().all();
	
String query = "select * from project;";
		
		String actData = dlib.readDataFromDBAndValidate(query, 1, id);
		Assert.assertEquals(id, actData);
		System.out.println("TC Pass");
		
		
	}
}
