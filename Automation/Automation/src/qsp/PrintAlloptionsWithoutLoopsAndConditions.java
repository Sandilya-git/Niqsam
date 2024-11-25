package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlloptionsWithoutLoopsAndConditions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();Thread.sleep(2000);
		d.manage().window().maximize();Thread.sleep(2000);
		d.get("file:///C:/Users/Anuraag/Desktop/Test%20Data/Hotel.html");Thread.sleep(2000);
		WebElement mtrlistbox=d.findElement(By.id("mtr"));Thread.sleep(2000);
		Select s=new Select(mtrlistbox);Thread.sleep(2000);
		String text=s.getWrappedElement().getText();Thread.sleep(2000);
		System.out.println(text);Thread.sleep(2000);
		d.quit();

	}

}
