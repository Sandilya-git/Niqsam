package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssgn {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui");
	driver.findElement(By.xpath("//section[text()='Frames']")).click();
	driver.findElement(By.linkText("iframes")).click();
	driver.findElement(By.linkText("Nested iframe")).click();Thread.sleep(2000);
	driver.switchTo().frame(0);
	String email = driver.findElement(By.xpath("//p[text()='Default Email']/../p[2]")).getText();
	String pwd = driver.findElement(By.xpath("//p[text()='Default Email']/../p[4]")).getText();
	String confirmPwd = driver.findElement(By.xpath("//p[text()='Default Email']/../p[6]")).getText();
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("confirm-password")).sendKeys(confirmPwd);
}
}
