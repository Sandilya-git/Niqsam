package jsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Abhishek/Desktop/Mtrmenu.html");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("mtr"));
				Select s=new Select(e);
				List<WebElement> opts = s.getOptions();
				HashSet<String> hs=new HashSet<String>();
				HashSet<String> ds=new HashSet<String>();
				
				for(WebElement op:opts)
				{
					String text= op.getText();
					if(!(hs.add(text)))
					{
						ds.add(text);
					}
				}
				
				System.out.println(ds);
				
		
	}
}
