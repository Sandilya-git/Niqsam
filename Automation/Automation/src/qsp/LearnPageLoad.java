package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPageLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		d.get("https://online.actitime.com/student20/login.do");

	}

}
