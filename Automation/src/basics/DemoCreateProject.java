package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCreateProject {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("TASKS")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("anil");
		Thread.sleep(3000);
		driver.findElement(By.id("projectPopup_customerSelectorPlaceholder")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Our Company']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("daddy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	}

}
