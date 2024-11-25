package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();Thread.sleep(2000);
		d.manage().window().maximize();
		d.get("file:///C:/Users/Anuraag/Desktop/Test%20Data/Hotel.html");Thread.sleep(2000);
		WebElement mtrlistbox=d.findElement(By.id("mtr"));Thread.sleep(2000);
		Select s=new Select(mtrlistbox);Thread.sleep(2000);
		List<WebElement> alloptions=s.getOptions();Thread.sleep(2000);
		int count=alloptions.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(2000);
			s.deselectByIndex(i);
		}
		System.out.println(count);
		d.quit();

	}

}
