package jsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemsInOrder {

	

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("file:///C:/Users/Abhishek/Desktop/Mtrmenu.html");
    WebElement e = driver.findElement(By.id("mtr"));
    Select s = new Select(e);
    List<WebElement> opts = s.getOptions(); 
    Thread.sleep(2000);
    TreeSet<String> st=new TreeSet<String>();
    
    
      for(WebElement opt:opts)
      {
    	  String str = opt.getText();
    	  Thread.sleep(2000);
    	  st.add(str);
    	  
      }
      
      System.out.println(st);
	}

}
