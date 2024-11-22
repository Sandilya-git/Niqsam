package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/Users/Abhishek/Desktop/Mtrmenu.html");
driver.manage().window().maximize();
WebElement e = driver.findElement(By.id("mtr"));
Select s=new Select(e);
Thread.sleep(2000);
s.selectByIndex(4);
Thread.sleep(2000);
s.selectByValue("p");
Thread.sleep(2000);
s.selectByVisibleText("akkirotti");
Thread.sleep(2000);
s.selectByValue("b");
Thread.sleep(2000);
s.deselectAll();

	}

}
