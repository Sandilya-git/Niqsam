package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://online.actitime.com/student20/login.do");
		d.findElement(By.id("username")).sendKeys("anuakasunny@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(5));
		//wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Logout'])"))));
		wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Logout'])"))));
		String title=d.getTitle();
		System.out.println(title);
		d.quit();
		
		
	}

}

