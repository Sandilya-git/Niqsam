package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		
	}

}
