package QSP2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("file:///C:/Users/dutta/Desktop/frame1.html");
driver.findElement(By.id("t1")).sendKeys("jsp");
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.id("t2")).sendKeys("qsp");






	
	
	}

}
