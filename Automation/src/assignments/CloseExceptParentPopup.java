package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseExceptParentPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Thread.sleep(2000);
		String pw = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
	
		
			for(String wh : allwh)
			{
				if(!pw.equals(wh))
				{
					Thread.sleep(3000);
				driver.switchTo().window(wh);
				driver.close();
			}
		
	}

	}
}
