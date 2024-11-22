package assignments;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemPresentInList {

	public static void main(String[] args) {

		System.out.println("Enter a dish to find");
		Scanner sc = new Scanner(System.in);
		String dish = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/athar/Desktop/food.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		int count =0;
		for(int i = 0;i<alloptions.size();i++)
		{
			String text = alloptions.get(i).getText();
			if(text.equals(dish))
			{
				count++;
				break;
			}
		}
		if(count >0)
			System.out.println(dish + " is present");
		else
			System.out.println(dish + " is not present");
		sc.close();
	}
	

}
