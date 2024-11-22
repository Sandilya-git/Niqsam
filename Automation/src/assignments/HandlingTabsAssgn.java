package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsAssgn {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read License Agreement")).click();
		Thread.sleep(2000);
		String wh = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> urls = driver.getWindowHandles();
		for( String url : urls)
		{
					if(!url.equals(wh))
		
		    driver.switchTo().window(url);
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		 List<WebElement> heads = driver.findElements(By.tagName("h2"));
		 for(int i =0;i<heads.size();i++)
		 {
			 String t = heads.get(i).getText();
			 System.out.println(t);
			 
		 }
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(wh);
	driver.close();
	}

}
