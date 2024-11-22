package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranaceAssignment {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.id("policynumber")).sendKeys("123");
    driver.findElement(By.id("dob")).click();
    WebElement monthListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
    Select m=new Select(monthListbox);
    m.selectByIndex(9);
    WebElement yearListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
    Select y=new Select(yearListbox);
    y.selectByVisibleText("1999");
    driver.findElement(By.linkText("19")).click();
    driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
    driver.findElement(By.id("renew_policy_submit")).click();
   boolean res = driver.findElement(By.id("policynumberError")).isDisplayed();
   if(res==true) {
	   System.out.println("please enter valid policy no. is displayed");
   }
   else {
	   System.out.println("please enter valid policy no. is not displayed");
   }
    
    
	}

}
