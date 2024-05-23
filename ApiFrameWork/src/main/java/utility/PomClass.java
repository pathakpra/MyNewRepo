package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import io.restassured.response.Response;

public class PomClass extends BaseClass  {

	@FindBy(xpath = "//a[.='Projects']")
	////p[.='Menu']/../li/a[.='Projects']
	private WebElement projLink;
	
	@FindBy(xpath = "//span[.='Create Project']")
	private WebElement createProjBtn;
	
	@FindBy(xpath = "//input[@name='projectName']")
	private WebElement projName;
	
	@FindBy(xpath = "//input[@name='createdBy']")
	private WebElement proManager;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//option[.='Select Value']")
	private WebElement opts;
	
	
	
	public PomClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createProj() {
		projLink.click();
		createProjBtn.click();
	}
	
	public void sendProjData(WebDriver driver) throws SQLException {
		//WebDriver driver = null;
		JavaUtils ju = new JavaUtils();
		WebUtils wu = new WebUtils();
		
		BaseClass bs = new BaseClass();
		
		String prName = "MyProj"+ju.randomNum();
		System.out.println(prName);
		
		projName.sendKeys(prName);
		proManager.sendKeys("Mee");
	//	wu.selectMethod(opts,"created"); ////div[@class='ReactModal__Content ReactModal__Content--after-open']//label['.Project Status' ]/../select
		submitBtn.click();
		WebElement pid = driver.findElement(By.xpath("//td[.='"+prName+"']/preceding-sibling::td"));
        String pidN = pid.getText();		
		System.out.println(pidN);
		
		Response respo =
				when().get(EndPointsLibrary.getSingleProject+pidN);
		System.out.println("==============================================");
		String exData = ru.getJsonData(respo, "projectId");
		System.out.println("==============================================");
		System.out.println(exData);
		System.out.println("==============================================");
		respo.then().log().all();
		System.out.println("==============================================");
		String query = "select * from project;";
		
		String acdata = dlib.readDataFromDBAndValidate(query, 1, exData);
		System.out.println("==============================================");
		Assert.assertEquals(exData,acdata);
		
		   
	}
	
	
}
