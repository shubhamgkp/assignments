package classPractice;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSignUpAutomate {

	public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("u_0_j")).sendKeys("Shubham");
		driver.findElement(By.name("lastname")).sendKeys("Verma");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("u_0_v")).sendKeys("123456789");
		driver.findElement(By.xpath("//label[@for='u_0_9']")).click();
		//driver.findElement(By.cssSelector("label[@class='_58mt']"));
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
}
