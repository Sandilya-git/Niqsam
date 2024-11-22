package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJS {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollTo(0,2000)");
	jse.executeScript("window.scrollBy(0,1000)");//It will scroll for 3000 pixels
}
}
