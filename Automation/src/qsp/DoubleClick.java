package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Login"));
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
		String title = driver.getTitle();
		Thread.sleep(2000);
        if (title.equals("Login - Vtiger"))
        	{
        			System.out.println("login page is displayed");
        	}
        else
        {
        	System.out.println("login page is not displayed");
        }
        driver.quit();	

	}

}
