package endToEnd;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utility.BaseClass;
import utility.EndPointsLibrary;
import utility.PoJoUtils;

public class Update extends BaseClass{

	@Test
	public void createProjTest() throws SQLException {
		//it is 2 layer project  ---- 
		PoJoUtils pj = new PoJoUtils("PrachiiPath", "P_Projtyyt"+ju.randomNum(), "Done", 6);
		
		
		//Step 2: end the request
		
		
		Response respon = given().spec(req).body(pj).contentType(ContentType.JSON)
				.when().post(EndPointsLibrary.createProject);
		
		//Step 3: Capture the project ID
		
		String exData = ru.getJsonData(respon, "projectId");
		System.out.println(exData);	
		respon.then().log().all();
		
		// Step 4: Validate the id in dataBase
		
		String query = "select * from project;";
		
		String actData = dlib.readDataFromDBAndValidate(query, 1, exData);
		Assert.assertEquals(exData, actData);
		System.out.println("TC Pass");
	}
}
