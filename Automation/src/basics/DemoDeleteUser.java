package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDeleteUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("USERS")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='filterFieldInput inputFieldWithPlaceholder'])")).sendKeys("Samir Sandilya");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='userNameContainer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
