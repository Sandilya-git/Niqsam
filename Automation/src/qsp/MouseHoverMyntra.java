package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMyntra {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    driver.get("https://www.myntra.com/shop/men");
    WebElement target=driver.findElement(By.linkText("F"));
    Actions a=new Actions(driver);
    Thread.sleep(5000);
    a.moveToElement(target).perform();
   
	}

}
