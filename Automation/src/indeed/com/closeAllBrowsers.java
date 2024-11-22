package indeed.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class closeAllBrowsers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/?r=us");
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		Actions a=new Actions(driver);
		a.doubleClick(signIn).perform();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwin = driver.getWindowHandles();
		String pwin = driver.getWindowHandle();
		for (String win :allwin) {
			driver.switchTo().window(win);
			driver.close();
			

		}
	}

}
