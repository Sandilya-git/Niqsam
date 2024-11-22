package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnFlipcart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.className("Pke_EE"));
		search.sendKeys("iphone 14 pro max");
		search.sendKeys(Keys.ENTER);
		List<WebElement> names = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]/../../div[2]/div[1]/div[1]/div"));
		int count = names.size();
		int count1 = prices.size();
	
		if(count == count1) {
		System.out.println("Phone\t\t\t\t\t\t\t\tPrice");
		System.out.println("------\t\t\t\t\t\t\t\t------");
		for(int i =0; i< count ; i++)
		{
			String phonetxt = names.get(i).getText();
			String pricetxt = prices.get(i).getText();
			System.out.println(phonetxt + "\t\t\t" + pricetxt);
			}
		}
		else
			System.out.println("there is a mismatch in no of phones and prices");
		
		driver.quit();
	
		
	}

}
