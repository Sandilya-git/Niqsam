package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTesting {

	public static void main(String[] args) {
    ArrayList<String>a=new ArrayList<String>();
    a.add("http://localhost/login.do");
    a.add("admin");
    a.add("admin@actitime.com");
    a.add("manager");
    System.out.println(a.get(2));
    
    HashMap<String, String> h=new HashMap<String, String>();
    h.put("url", "http://localhost/login.do");
    h.put("username", "admin");
    h.put("email", "admin@actitime.com");
    h.put("password", "manager");
    System.out.println(h.get("password"));
    
	}
}
    