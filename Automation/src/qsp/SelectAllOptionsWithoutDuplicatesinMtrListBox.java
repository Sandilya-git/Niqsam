package qsp;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectAllOptionsWithoutDuplicatesinMtrListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/samir/OneDrive/Desktop/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		System.out.println(count); 
	    Set<String> opt=new TreeSet<String>();
		for (int i = 0; i < count; i++) {
			String text = allOptions.get(i).getText();
			opt.add(text);
		}
		for(String txt:opt) {
			System.out.println(txt);
		}
		
	}

}
