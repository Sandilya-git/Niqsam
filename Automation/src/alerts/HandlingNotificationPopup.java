package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("__disable_notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.yatra.com/");
		driver.quit();
	}

}
