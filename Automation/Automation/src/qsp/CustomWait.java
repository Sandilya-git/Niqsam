package qsp;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver d=new ChromeDriver();
        d.get("https://online.actitime.com/student20/login.do");
        d.findElement(By.id("username")).sendKeys("anuakasunny@gmail.com");
        d.findElement(By.name("pwd")).sendKeys("manager");
        d.findElement(By.xpath("//div[text()='Login ']")).click();
        for(int i=0;i<1000;i++)
        {
        	try
        	{
        		d.findElement(By.xpath("(//a[text()='Logout'])")).click();
        		break;
        	}
        	catch(NoSuchElementException e)
        	{
        		System.out.println(i);
        	}
        	}
        }
	}


