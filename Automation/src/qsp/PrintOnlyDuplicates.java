package qsp;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr = d.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	Set<String> hs=new HashSet<>();
	List<WebElement> allOpt = s.getOptions();
	for (WebElement ele : allOpt) {
		String text = ele.getText();
		if(!hs.add(text)) {
			System.out.println(text);
		}
	}
}
}
