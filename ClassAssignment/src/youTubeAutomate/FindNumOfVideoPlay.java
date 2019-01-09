package youTubeAutomate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumOfVideoPlay {


	public static WebDriver driver;	
	
	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.navigate().to("https://www.youtube.com/");
			driver.manage().window().maximize();
			
			List<WebElement> elements = driver.findElements(By.id("img"));
			System.out.println(elements.size());
			elements.get(0).click();
	}
}
