package endToEnd;

import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.IConstants;
import utility.LoginPomClass;
import utility.PomClass;

public class CreateRmgProject extends BaseClass {

	@Test
public void createProjectInfo() throws SQLException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(IConstants.rmgUrl);
	PomClass pc = new PomClass(driver);
	LoginPomClass lp = new LoginPomClass(driver);
	
	
	lp.logibfun();
	pc.createProj();
	pc.sendProjData(driver);
	
	
}
}
