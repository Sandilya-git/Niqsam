package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOpsnSlvListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/samir/OneDrive/Desktop/hotel.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		List<WebElement> asOption = s.getAllSelectedOptions();
		int count = asOption.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = asOption.get(i).getText();
			System.out.println(text);

		}
	}

}
