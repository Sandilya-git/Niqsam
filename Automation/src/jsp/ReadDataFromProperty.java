package jsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {

		FileInputStream fis= new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String str = p.getProperty("url");
		System.out.println(str);
		String un = p.getProperty("username");
		System.out.println(un);
		String pw = p.getProperty("password");
		System.out.println(pw);
	
		
		
		
		
		
		
		
	}

}
