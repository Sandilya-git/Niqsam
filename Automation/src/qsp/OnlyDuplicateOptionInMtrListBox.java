package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicateOptionInMtrListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/samir/OneDrive/Desktop/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		System.out.println(count); 
		Set<String> opt=new HashSet<String>();
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			if(!opt.add(text))
				System.out.println(text);
		}


	}

}
