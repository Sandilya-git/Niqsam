package basics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDeleteCustomer {

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
		driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys("Samir");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='highlightToken']/../..//div[@class='editButton available']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='customerNamePlaceHolder']/..//div[@class='action']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		driver.findElement(By.id("logoutLink")).click();
	}

}
