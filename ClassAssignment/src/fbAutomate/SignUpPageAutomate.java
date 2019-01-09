package fbAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPageAutomate {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#u_0_j")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Verma");
		driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-[name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#u_0_v")).sendKeys("Skv@2580");
		
		WebElement date = driver.findElement(By.id("day"));
		SelectDOB.fbDOB(date, "8");
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		SelectDOB.fbDOB(month, "Mar");
		WebElement year = driver.findElement(By.cssSelector("select#year"));
		SelectDOB.fbDOB(year, "1995");
		driver.findElement(By.cssSelector("label[for='u_0_a']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();		
	}
}
