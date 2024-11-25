package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement monthListBox=d.findElement(By.name("birthday_month"));
		Select s=new Select(monthListBox);
		s.selectByIndex(7);
		Thread.sleep(2000);
		s.selectByValue("1");
		Thread.sleep(2000);
		s.selectByVisibleText("Aug");
	}

}
