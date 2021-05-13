package pages;





import java.awt.Desktop.Action;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 import constant.Baseclass;

public class T005Tabmouseover extends Baseclass {
	
	
	@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount; 
	
	@FindBy(xpath = "(//a[contains(.,'Login')])[1]") WebElement Loginbutton;
		
		@FindBy(xpath = "//input[@id='input-email']") WebElement Loginemail;
		@FindBy(xpath = "//input[@id='input-password']") WebElement LoginPassword;
		
		@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Buttonlogin;
		
		
		@FindBy(xpath = "(//a[contains(.,'Desktops')])[1]") WebElement Desktop;
		
		
		 @FindBy(xpath = "//a[contains(.,'Mac (1)')]") WebElement Mac;
		 @FindBy(xpath = "//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'Add to Cart')]") WebElement Addcart;
		 
		 public T005Tabmouseover() {
		 PageFactory.initElements(driver, this);
		 
		
		 

}
		 public void Book() {

			 Myaccount.click();
	        Loginbutton.click();
	        Loginemail.sendKeys(prop.getProperty("Email"));
	        LoginPassword.sendKeys(prop.getProperty("Password"));
	        Buttonlogin.click();
	        Actions actions = new Actions(driver);
			 actions.moveToElement(Desktop).perform();
			 System.out.println("Done Mouse hover on 'Desktop' from Menu");
	         Mac.click();
	        Addcart.click();
	        
		 }





	}



