package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/samir/OneDrive/Desktop/naukri.html");
		Thread.sleep(5000);
		File f=new File("./Data/SAMIR SANDILYA RESUME.pdf");
		String absPath = f.getAbsolutePath();
		Thread.sleep(3000);
	    driver.findElement(By.id("cv")).sendKeys(absPath);
	}

}
