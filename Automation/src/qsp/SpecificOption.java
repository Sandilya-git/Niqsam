package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificOption {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the item");
	String item = s.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr=driver.findElement(By.id("mtr"));
	Select select=new Select(mtr);
	List<WebElement> allOptions = select.getOptions();
	int count=0;
	for(int i=0;i<allOptions.size();i++) {
		WebElement ele = allOptions.get(i);
		String text = ele.getText();
		if(item.equalsIgnoreCase(text) ||text.contains(item)) {
			count++;
			break;
		}
	}
	if(count>0) {
		System.out.println(item+" is present in the dropdown");
	}else {
		System.out.println(item+" is not present in the dropdown");
	}
}
}
