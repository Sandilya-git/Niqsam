package QSP2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPropertyData {

	public static void main(String[] args) throws IOException, InterruptedException {

	FileInputStream fs = new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fs);
	String url = p.getProperty("url");
	String un = p.getProperty("email");
	String pw = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);	
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys(un);
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(pw);
	
	
	
	
	
	}

}
