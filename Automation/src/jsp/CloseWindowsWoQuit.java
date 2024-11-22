package jsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowsWoQuit {

	public static void main(String[] args) throws InterruptedException {

	 WebDriver driver = new ChromeDriver();
	 driver.get("https://secure.indeed.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.id("login-google-button")).click();
	 driver.findElement(By.id("apple-signin-button")).click();
	 Thread.sleep(2000);
	 Set<String> allwh = driver.getWindowHandles();
	 for(String wh:allwh)
	 {
		 driver.switchTo().window(wh);
		 
		 driver.close();
	 }
	 
	 
		
		
		
	}

}
