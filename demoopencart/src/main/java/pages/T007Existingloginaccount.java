package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import constant.Baseclass;

public class T007Existingloginaccount extends Baseclass {
	
@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount; 
	
	@FindBy(xpath = "(//a[contains(.,'Login')])[1]") WebElement Loginbutton;
		
		@FindBy(xpath = "//input[@id='input-email']") WebElement Loginemail;
		@FindBy(xpath = "//input[@id='input-password']") WebElement LoginPassword;
		
		@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Buttonlogin;
		@FindBy(xpath = "(//a[@class='list-group-item'])[2]") WebElement Edit;
		@FindBy(xpath = "//input[@id='input-lastname']") WebElement Lastname1;
		@FindBy(xpath = "//input[contains(@class,'btn btn-primary')]") WebElement Continue;
		@FindBy(xpath = "(//a[@class='list-group-item'])[13]") WebElement Logout;
		@FindBy(xpath = "//a[contains(.,'Continue')]") WebElement Continue1;
		
		public T007Existingloginaccount() {
			PageFactory.initElements(driver, this);
		}

		
		public void Changelastname() throws InterruptedException {
			
			 Myaccount.click();
		        Loginbutton.click();
		        Loginemail.sendKeys(prop.getProperty("Email"));
		        LoginPassword.sendKeys(prop.getProperty("Password"));
		        Buttonlogin.click();
		        Edit.click();
		        
		        Lastname1.clear();
		        Lastname1.sendKeys(prop.getProperty("Lastname1"));
		        Continue.click();
		        Logout.click();
		       Continue1.click();
		        
			
			
		}
		
		
		
		
}
