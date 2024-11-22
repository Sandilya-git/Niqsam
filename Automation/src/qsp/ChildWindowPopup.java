package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://secure.indeed.com/");
   String wH = driver.getWindowHandle();
   System.out.println(wH);
   driver.quit();
	}
  
}
