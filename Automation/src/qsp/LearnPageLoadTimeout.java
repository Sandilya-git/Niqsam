package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPageLoadTimeout {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    try {
    	 driver.get("https://online.actitime.com/ssandeep/login.do");
    	 System.out.println("page is loaded within 5 seconds");
    }
    catch(Exception e) {
    	System.out.println("page is not loaded within 5 seconds");
    }
    driver.quit();
   
	}

}
