package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxProgram {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new FirefoxDriver();
     driver.get("http://localhost/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("USERS")).click();
	}

}
