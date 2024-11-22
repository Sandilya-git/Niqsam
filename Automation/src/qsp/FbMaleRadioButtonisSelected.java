package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbMaleRadioButtonisSelected {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.xpath("//span[.='Male']/label[1]/input")).click();
		boolean selected = driver.findElement(By.xpath("//span[.='Male']/label[1]/input")).isSelected();
		if(selected==true)
		{
		System.out.println("male radio button is selected");
		}
		else
		{
		System.out.println("it is not selected");
		}
	}

}
