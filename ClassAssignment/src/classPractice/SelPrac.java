package classPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelPrac {

	public WebDriver driver;
	
	@Test
	public void openBrowser(){		

		try{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromdriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
		}		
		catch (Exception e) {
			//System.out.println("Shubham"); 			
		}		
	}
}
