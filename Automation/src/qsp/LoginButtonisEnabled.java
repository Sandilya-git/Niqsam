package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonisEnabled {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean enable = driver.findElement(By.name("login")).isEnabled();
	if(enable==true) {
	System.out.println("it is enabled");
	}
	else
	{
	System.out.println("it is disabled");
	}

  }
}
