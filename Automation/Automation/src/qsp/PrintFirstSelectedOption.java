package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("file:///C:/Users/Anuraag/Desktop/Test%20Data/Hotel.html");
		Thread.sleep(2000);
		WebElement fsListbox=d.findElement(By.id("slv"));
		Thread.sleep(2000);
		Select s=new Select(fsListbox);
		Thread.sleep(2000);
		WebElement fsoption=s.getFirstSelectedOption();
		Thread.sleep(2000);
		String text=fsoption.getText();
		Thread.sleep(2000);
		System.out.println(text);
		Thread.sleep(2000);
		d.quit();
		Thread.sleep(2000);

	}

}
