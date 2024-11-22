package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {
public static void main(String[] args) throws InterruptedException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Date");
	int expDate=s.nextInt();
	Thread.sleep(1000);
	System.out.println("Enter the Month");
	Thread.sleep(1000);
	String expMonth=s.next();
	System.out.println("Enter the Year");
	String expYear=s.next();
	Thread.sleep(5000);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	Select s1=new Select(day);	Select s2=new Select(month);	Select s3=new Select(year);
List<WebElement> allDates = s1.getOptions();	List<WebElement> allMonths = s2.getOptions();
	List<WebElement> allYears = s3.getOptions();
	for(int i=0;i<allDates.size();i++) {
		s1.selectByIndex(i);
		if(expDate-1==i) 		break;	}
	for(int i=0;i<allMonths.size();i++) {
		String text = allMonths.get(i).getText();
		s2.selectByVisibleText(text);
		if(expMonth.equals(text))	break;	}
	for(int i=0;i<allYears.size();i++) {
		String text = allYears.get(i).getText();
		s3.selectByIndex(i);
		if(expYear.equals(text)) 	break;	}
}}
