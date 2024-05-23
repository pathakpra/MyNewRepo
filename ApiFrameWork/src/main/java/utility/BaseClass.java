package utility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
//import endToEnd.CreateRmgProject;



public class BaseClass {

	
	public DataBaseUtils dlib = new DataBaseUtils();
	public JavaUtils ju = new JavaUtils();
	public RestAssuredLibrary ru = new RestAssuredLibrary();
	public ResponseSpecification res ;
	public RequestSpecification req;
    
	
	@BeforeSuite
	public void bsConfig() throws SQLException {
		dlib.connectToDB();
		
		
		req = new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
				.setContentType(ContentType.JSON).build();
		res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		
		
		
	}
	
	@AfterSuite
	public void asConfig() throws SQLException {
		dlib.closeDB();
	}
	
	public void loginfun() {
		
	}
	
	
	
	
	
	
}
