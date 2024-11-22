package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupWiithOknCancel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@ class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(5000);
	   boolean res = driver.findElement(By.id("demo")).isDisplayed();
	   if(res==true) {
		   System.out.println("you pressed cancel is displayed");
	   }
	   else {
		   System.out.println("you pressed cancel is not displayed");
	   }
		 
	}

}
