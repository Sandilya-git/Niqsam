package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	//open the browser
    WebDriver driver =new ChromeDriver();
    //enter the url
    driver.get("https://www.google.com/");
    //type selenium in search textbox
    driver.findElement(By.id("APjFqb")).sendKeys("selenium");
    Thread.sleep(2000);
    //find all the autosuggestion and print the count
    List<WebElement> aSug = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
    int count = aSug.size();
    System.out.println(count);
    //print all the auto suggestion
    for(int i=0;i<count;i++) {
    	String text = aSug.get(i).getText();
    	System.out.println(text);
    	}
    //click on the last suggestion
    aSug.get(count-1).click();    	
    }
	}


