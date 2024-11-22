package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListSortAll {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/athar/Desktop/food.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		List<String> al = new ArrayList<String>();
		Set<String> ts = new TreeSet<String>();
		Set<String> hs = new HashSet<String>();
		System.out.println("Only duplicate items");
		System.out.println("---------------------------");
		
		for(int i=0;i<alloptions.size();i++)
		{
			WebElement ele = alloptions.get(i);
		
			 String text = ele.getText();
			 al.add(text);
			 ts.add(text);
			 
			 if(!hs.add(text))
			 {
				 System.out.println(text);
			 }
			 hs.add(text);
		}
		Collections.sort(al);
	
		//al.sort(null);
		System.out.println("---------------------------");
		System.out.println("Item list in Sorted order");
		System.out.println("---------------------------");
		for(String text : al)
		{
			System.out.println(text);
		}
		System.out.println("---------------------------");
		System.out.println("Item list in sorted order without duplicates");
		System.out.println("---------------------------");
		for(String text :ts)
		{
			System.out.println(text);
		}
		System.out.println("---------------------------");
		System.out.println("Item list without duplicates");
		System.out.println("---------------------------");
		for(String text :hs)
		{
			System.out.println(text);
		}
		
		
		driver.quit();
	}

}
