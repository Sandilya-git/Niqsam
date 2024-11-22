package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://online.actitime.com/ssandeep/login.do");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    for (int i = 0; i < 50; i++) {
    	try {
    		driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
    		break;
    	}
    	catch (Exception e) {
    		System.out.println(i);
    		
    	}
		}
    	
    }
	

}
