package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		try
		{
			d.get("https://online.actitime.com/student20/login.do");
			System.out.println("Page is loaded within 10 seconds and pass");
			
		}
        catch(Exception e)
		{
        	System.out.println("Page is not loaded within 10 seconds and fail");
		}
		d.quit();
	}

}
