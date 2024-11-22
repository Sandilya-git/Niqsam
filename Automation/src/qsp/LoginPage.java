package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 @FindBy(id="username")
     private WebElement untbx;
	 
	 @FindBy(name="pwd")       //declaration
     private WebElement pwtbx;
	 
	 @FindBy(xpath="//div[.='Login ']")
     private WebElement lgbtn;
     
     public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);	 //initialization
     }
     public void setLogin(String un,String pw) {
    	 untbx.sendKeys(un);
    	 pwtbx.sendKeys(pw);     //utilization
    	 lgbtn.click();
     }
}
