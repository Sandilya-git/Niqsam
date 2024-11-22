package qsp;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParent {
public static void main(String[] args) throws InterruptedException {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter a title");
//	String Expectedtitle = sc.nextLine();//Apple
WebDriver	driver=new ChromeDriver();
driver.get("http://localhost/login.do");
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Login")).click();
//driver.manage().window().maximize();
//driver.findElement(By.id("login-google-button")).click();
//driver.findElement(By.id("apple-signin-button")).click();
//Set<String> allwh = driver.getWindowHandles();
//Iterator<String> i = allwh.iterator();
//while (i.hasNext()) {
//	String wh = i.next();
//	driver.switchTo().window(wh);
//	String title = driver.getTitle();
//	if(title.contains(Expectedtitle))
//	{
//		driver.close();
//	}
//}
//	
}
}

