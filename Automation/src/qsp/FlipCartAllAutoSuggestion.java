package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartAllAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.name("q")).sendKeys("iphone");
	    Thread.sleep(2000);
	    List<WebElement> aSug = driver.findElements(By.xpath("//input[@type='text' and @value='iphone']"));
	    int count = aSug.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++) {
	    	String text=aSug.get(i).getText();
	    	System.out.println(text);
	    	}
	    aSug.get(0).click();
	}
	
    
}
