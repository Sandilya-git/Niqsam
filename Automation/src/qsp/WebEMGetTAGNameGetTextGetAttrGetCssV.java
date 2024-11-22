package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEMGetTAGNameGetTextGetAttrGetCssV {
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    WebElement wE = driver.findElement(By.name("login"));
	    String tagname= wE.getTagName();
	    System.out.println(tagname);
	    String text =wE.getText();
	    System.out.println(text);
	    String attr = wE.getAttribute("data-testid");
	    System.out.println(attr);
	    String cssValue = wE.getCssValue("border");
	    System.out.println(cssValue);
	    driver.quit();
	    
	    
	    
	}
}
