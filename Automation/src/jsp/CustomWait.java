package jsp;



import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		for(int i=0; i<1000;i++)
		{
			try 
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
			 System.out.println(i);
			}
			catch(ElementClickInterceptedException e1)
			{
				 System.out.println(i);
			}
		
		}
		driver.quit();
		
		
		
		
		
	}

}
