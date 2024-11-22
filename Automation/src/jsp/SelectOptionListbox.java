package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionListbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Abhishek/Desktop/Mtrmenu.html");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.id("mtr"));
		Select s = new Select(e);
		Thread.sleep(2000);
		List<WebElement> opts = s.getOptions();
	    for(WebElement op:opts)
	    {
	    	System.out.println(op.getText());
	    }
	
	}

}
