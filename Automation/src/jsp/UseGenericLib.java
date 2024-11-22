package jsp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class UseGenericLib {

	public static void main(String[] args) throws IOException {
		FileLib fl=new FileLib();
	WebDriver driver = new ChromeDriver();
	driver.get(fl.getProperty("url"));

	}

}
