package indeed.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_diplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean res = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
		if(res==true)
		{
			System.out.println("facebook is displayed");
		}
		else
		{
			System.out.println("facebook is not displayed");
		}
		driver.quit();
	}

}
