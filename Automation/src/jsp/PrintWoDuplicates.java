package jsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWoDuplicates {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Abhishek/Desktop/Mtrmenu.html");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("mtr"));
				Select s=new Select(e);
				List<WebElement> opts = s.getOptions();
				HashSet<String> hs=new HashSet<String>();
				
				for(WebElement op:opts)
				{
					String str = op.getText();
				    hs.add(str);
				}
				
				System.out.println(hs);
				
		
	}

}
