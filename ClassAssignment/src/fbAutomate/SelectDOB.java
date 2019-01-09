package fbAutomate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {

	public static void fbDOB(WebElement element, String value){
		
		Select sel = new Select(element);
		sel.selectByVisibleText(value);		
	}	
}
