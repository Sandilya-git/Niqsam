package QSP2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/dutta/Desktop/frame1.html");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);// we are going to child frame i.e t2
	driver.findElement(By.id("t2")).sendKeys("qsp");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("jsp");
	
	}

}
