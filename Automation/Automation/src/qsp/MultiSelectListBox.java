package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/Anuraag/Desktop/Test%20Data/Hotel.html");	Thread.sleep(2000);
		WebElement mtrlistbox=d.findElement(By.id("mtr"));	Thread.sleep(2000);
		Select s=new Select(mtrlistbox);	Thread.sleep(2000);
		s.selectByIndex(0);	Thread.sleep(2000);
		s.selectByValue("v");	Thread.sleep(2000);
		s.selectByVisibleText("dosa");	Thread.sleep(2000);
		Thread.sleep(5000);	Thread.sleep(2000);
		s.deselectByIndex(2);	Thread.sleep(2000);
		s.deselectByValue("d");	Thread.sleep(2000);
		s.deselectByVisibleText("idly");	Thread.sleep(2000);
		System.out.println(s.isMultiple());	Thread.sleep(2000);
		d.close();

	}

}
