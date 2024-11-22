package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNaukriWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samir.sandilya651@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Yellow@12543");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a[href=\"/mnjuser/profile\"]")).click();
		Thread.sleep(10000);
		File f=new File("./Data/SAMIR SANDILYA RESUME.pdf‪");
		String absPath = f.getAbsolutePath();
		driver.findElement(By.xpath("//span[text()='Upload resume']")).sendKeys(absPath);    
	}

}
