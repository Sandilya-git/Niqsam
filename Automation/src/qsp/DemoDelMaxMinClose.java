package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDelMaxMinClose {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     driver.manage().window().minimize();
     driver.close();
	}

}
