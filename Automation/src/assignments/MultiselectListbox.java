package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectListbox {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/athar/Desktop/food.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlist);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		Thread.sleep(1000);
		s.deselectByIndex(2);
		s.deselectByValue("d");
		s.deselectByVisibleText("idly");
		System.out.println(s.isMultiple());
		
		WebElement slvlist = driver.findElement(By.id("slv"));
		Select s1 = new Select(slvlist);
		System.out.println(s1.getFirstSelectedOption().getText());
		List<WebElement> allsoptions = s1.getAllSelectedOptions();
		for (int i = 0; i < allsoptions.size(); i++)
			
		{
			String text = allsoptions.get(i).getText();
			System.out.println(text);
			
			
		}
		List<WebElement> alloptions = s1.getOptions();
		for (int i = 0; i < alloptions.size(); i++)
			
		{
			String text = alloptions.get(i).getText();
			System.out.println(text);
			
			
		}
		
		
		driver.quit();
		
		
	
	}

}
