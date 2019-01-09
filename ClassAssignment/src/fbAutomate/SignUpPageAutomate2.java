package fbAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPageAutomate2 {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Shubham");
		driver.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("Verma");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_o')]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Skv@2580");
		
		WebElement date = driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
		SelectDOB.fbDOB(date, "8");
		WebElement month = driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]"));
		SelectDOB.fbDOB(month, "Mar");
		WebElement year = driver.findElement(By.xpath("//select[contains(@name,'birthday_y')]"));
		SelectDOB.fbDOB(year, "1995");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();		
	}
}
