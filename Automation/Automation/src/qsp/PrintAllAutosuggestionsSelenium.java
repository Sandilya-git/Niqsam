package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutosuggestionsSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.co.in/");
		d.findElement(By.id(" ")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allSugg=d.findElements(By.xpath("//span[Contains[Contains(text(),'selenium')]]"));
		int count=allSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=allSugg.get(i).getText();
			System.out.println(text);
		}
		
		allSugg.get(count-1).click();
		}

	}


