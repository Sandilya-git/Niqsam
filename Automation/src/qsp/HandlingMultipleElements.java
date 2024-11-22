package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/samir/OneDrive/Desktop/htmlCode.html");
	   List<WebElement> e = driver.findElements(By.tagName("a"));
	   String element = e.get(0).getText();
	   System.out.println(element);
	}

}
