package indeed.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 driver.findElement(By.linkText("Create new account")).click();	
		 boolean female = driver.findElement( By.id("sex")).isSelected();
		 if(female==true)
		 {
			 System.out.println("radio button is selected");
		 }
		 else
		 {
			 System.out.println("radio button is not selected");
		 }

	}

}
