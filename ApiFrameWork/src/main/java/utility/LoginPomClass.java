package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass {

	@FindBy(id = "usernmae")
	private WebElement un;
	
	@FindBy(id = "inputPassword")
	private WebElement pw;
	
	@FindBy(xpath = "//button[.='Sign in']")
	private WebElement signIn;
	
	public LoginPomClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logibfun() {
		un.sendKeys(IConstants.appUserName);
		pw.sendKeys(IConstants.appPassword);
		signIn.click();
	}
}
