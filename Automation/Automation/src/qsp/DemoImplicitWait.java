package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://online.actitime.com/student20/login.do");
		Thread.sleep(2000);
		d.findElement(By.id("username")).sendKeys("anuakasunny@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(6000);
		d.findElement(By.id("logoutLink")).click();
		Thread.sleep(6000);
		d.close();
	}

}
