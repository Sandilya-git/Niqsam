package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();Thread.sleep(2000);
		d.manage().window().maximize();
		d.get("file:///C:/Users/Anuraag/Desktop/Test%20Data/Hotel.html");Thread.sleep(2000);
		WebElement slvlistbox=d.findElement(By.id("slv"));Thread.sleep(2000);
		Select s=new Select(slvlistbox);Thread.sleep(2000);
		List<WebElement> allsoptions=s.getAllSelectedOptions();Thread.sleep(2000);
		int count=allsoptions.size();Thread.sleep(2000);
		System.out.println(count);Thread.sleep(2000);
		for(int i=0;i<count;i++)
		{
			String text=allsoptions.get(i).getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
        d.quit();
	}

}
