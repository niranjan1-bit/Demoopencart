package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Baseclass;

public class T003Login extends Baseclass {
	
	 

	@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount; 
		
	@FindBy(xpath = "(//a[contains(.,'Login')])[1]") WebElement Loginbutton;
		
		@FindBy(xpath = "//input[@id='input-email']") WebElement Loginemail;
		@FindBy(xpath = "//input[@id='input-password']") WebElement LoginPassword;
		
		@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Buttonlogin;
		
		public T003Login( ) {
		PageFactory.initElements(driver, this);
		
		}
	
		public void clickLogin() {

			 Myaccount.click();
	        Loginbutton.click();
	        Loginemail.sendKeys(prop.getProperty("Email"));
	        LoginPassword.sendKeys(prop.getProperty("Password"));
	        Buttonlogin.click();
	        
	    }





}


