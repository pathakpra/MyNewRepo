package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebUtils {

	public void selectMethod(WebElement ele, String vtxt) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(vtxt);
	}
}
