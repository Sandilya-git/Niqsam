package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementGoogleSearchText {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.switchTo().activeElement().sendKeys("java");
	}

}