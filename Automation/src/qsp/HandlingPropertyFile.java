package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("./data/commonData.property");
    Properties p=new Properties();
    p.load(fis);
    String url = p.getProperty("url");
    String un = p.getProperty("un");
    String pw = p.getProperty("password");
    System.out.println(url);
    System.out.println(un);
    System.out.println(pw);
    
	}

}
