package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/samir/OneDrive/Desktop/input.html");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@ type='text'])[1]")).clear();    
    
	}

}
