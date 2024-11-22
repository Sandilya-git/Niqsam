package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(By.xpath("//span[@ class='commonModal__close']")).click();
    
    
    
	}

}
