package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSSListBoxDObFb {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.linkText("Create new account")).click();
    WebElement date = driver.findElement(By.id("day"));
    Select d=new Select(date);
    d.selectByVisibleText("19");
    WebElement month = driver.findElement(By.id("month"));
    Select m=new Select(month);
    m.selectByVisibleText("Oct");
    WebElement year=driver.findElement(By.id("year"));
    Select y=new Select(year);
    y.selectByVisibleText("1999");
    
	}

}
