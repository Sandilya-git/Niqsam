package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMSListboxMtrSlv {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/samir/OneDrive/Desktop/hotel.html");
    WebElement mtrListbox = driver.findElement(By.id("mtr"));
    Select s=new Select(mtrListbox);
    s.selectByValue("i");
    s.selectByVisibleText("vada");
    s.selectByValue("d");
    Thread.sleep(2000);
    s.deselectByVisibleText("vada");
    s.deselectByValue("d");
    s.deselectByValue("i");
    System.out.println(s.isMultiple());
	}

}
