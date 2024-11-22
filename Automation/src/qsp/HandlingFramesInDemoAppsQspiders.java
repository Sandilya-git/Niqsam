package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesInDemoAppsQspiders {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/");
    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//section[text()='Frames']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//section[text()='iframes']")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Nested iframe")).click();
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//div[@class='login-container']"));
    driver.switchTo().frame(0);
    driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
    
	}

}



         