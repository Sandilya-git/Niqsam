package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin1" ,"manager1");
		Thread.sleep(5000);
		l.setLogin("admin" ,"manager");
	}

}
