package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String title=d.getTitle();
		System.out.println(title);
		d.close();
		
		
		

	}

}
