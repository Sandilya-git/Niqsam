package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KSRTC {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://ksrtc.in/");Thread.sleep(2000);
	d.findElement(By.className("search-from-city")).click();
	d.findElement(By.xpath("//input[@placeholder='Search Your City Name']")).sendKeys("Bangalore"+Keys.ENTER);Thread.sleep(2000);
	d.findElement(By.className("search-to-city")).click();
	d.findElement(By.xpath("(//input[@placeholder='Search Your City Name'])[2]")).sendKeys("Dharmastala"+Keys.ENTER);Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='departDate']/..")).click();Thread.sleep(2000);
	d.findElement(By.linkText("15")).click();Thread.sleep(2000);
	d.findElement(By.id("submitSearch")).click();
	List<WebElement> allBusNames = d.findElements(By.xpath("//div[@class='bus--type']"));
	for (WebElement ele : allBusNames) {
		System.out.println(ele.getText());
	}
//	Thread.sleep(2000);
//	WebElement fromCity = d.findElement(By.id("fromCity"));
//	Select s=new Select(fromCity);
//	s.selectByVisibleText("Bangalore");
//	Thread.sleep(2000);
//	WebElement toCity = d.findElement(By.id("toCity"));
//	Select s1=new Select(toCity);
//	s1.selectByVisibleText("Dharmastala");
	
}
}
