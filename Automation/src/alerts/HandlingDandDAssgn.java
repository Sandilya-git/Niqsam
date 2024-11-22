package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDandDAssgn {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.cssSelector("div[class='dg-movable']"));
		WebElement src = driver.findElement(By.cssSelector("div[class='dg-crop-shadow']"));
		int xsrc = src.getLocation().getX();
		int ysrc = src.getLocation().getY();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDropBy(src1, xsrc, ysrc).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
