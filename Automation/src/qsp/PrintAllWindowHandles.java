package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWindowHandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
        driver.findElement(By.id("apple-signin-button")).click();
		 Set<String> allWh = driver.getWindowHandles();
		int count = allWh.size();
		System.out.println(count);
		for(String wH:allWh) {
			System.out.println(wH);
		}
		driver.quit();	
			
			
			
		
	}

}
