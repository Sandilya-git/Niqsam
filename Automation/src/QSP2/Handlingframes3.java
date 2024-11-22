package QSP2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/dutta/Desktop/frame1.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement allf = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(allf);
		driver.findElement(By.id("t2")).sendKeys("d");
	}

}
