package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'No cost EMI')]"));
	Actions a=new Actions(driver);
//scrollByAmount(int x,int y) will perform scrolling for mentioned pixels
	a.scrollByAmount(0, 500).perform();
//scrollToElement(WebElement ele) will scroll until element is visible in the UI
	a.scrollToElement(ele).perform();
}
}