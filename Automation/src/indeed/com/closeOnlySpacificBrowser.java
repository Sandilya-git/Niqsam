package indeed.com;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class closeOnlySpacificBrowser {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your window name to close");
	 String expectedBrowser = sc.nextLine();
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://in.indeed.com/?r=us");
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		Actions a=new Actions(driver);
		a.doubleClick(signIn).perform();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwin = driver.getWindowHandles();
		
		for (String wn :allwin) {
			driver.switchTo().window(wn);
	    @Nullable
		String title = driver.getTitle();
	    if(title.contains(expectedBrowser))
	    {
	    	driver.close();
	    }
			
	}

}
}
