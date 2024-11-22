package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAddUser {

	public static void main(String[] args) throws Exception {
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
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Samir");
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Sandilya");
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("samir@123");
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create User']")).click();
	}

}
