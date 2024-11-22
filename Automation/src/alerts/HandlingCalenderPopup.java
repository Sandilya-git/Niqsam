package alerts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalenderPopup {


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		  WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 Select s = new Select(month);
		 s.selectByIndex(2);
		 WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 Select s1 = new Select(year);
		 s1.selectByVisibleText("1980");
		 WebElement date = driver.findElement(By.xpath("//table"));
		 date.findElement(By.linkText("23")).click();
		 
		 driver.findElement(By.id("alternative_number")).sendKeys("9824598450");
		 driver.findElement(By.id("renew_policy_submit")).click();
		 String text = driver.findElement(By.id("policynumberError")).getText();
		 String text1 = driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).getText();
		 if(text.equals(text1))
		 {
			 System.out.println("pass");
			 
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 
		 driver.quit();
	
	}

}
