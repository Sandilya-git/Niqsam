package assignments;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificPopup {

	public static void main(String[] args) throws InterruptedException {

System.out.println("Enter the window you want to close");
		
		Scanner sc = new Scanner(System.in);
		 String text = sc.nextLine();
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		
	
		
			for(String wh : allwh)
				
			{
			
				Thread.sleep(3000);
				driver.switchTo().window(wh);
					
					String title = driver.getTitle();
					System.out.println(title);
					if(!title.contains(text))
					{
						driver.close();
					}	
											
					
				}
			sc.close();
				}
			
			
				
		
	}


