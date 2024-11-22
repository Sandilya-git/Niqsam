package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCreateCustomer {

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
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Samir");
		Thread.sleep(3000);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Test Engineer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Select an active customer')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Our Company']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		Thread.sleep(3000);
		WebElement createdcust = driver.findElement(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']"));
		System.out.println(createdcust.getText());
		driver.findElement(By.id("logoutLink")).click();
		

	}

}
