package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Baseclass;

public class T16Orderhistory extends Baseclass {
	
	@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount; 
	
	@FindBy(xpath = "(//a[contains(.,'Login')])[1]") WebElement Loginbutton;
		
		@FindBy(xpath = "//input[@id='input-email']") WebElement Loginemail;
		@FindBy(xpath = "//input[@id='input-password']") WebElement LoginPassword;
		
		@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Buttonlogin;
		@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount1; 
		@FindBy(xpath = "(//a[contains(.,'Order History')])[1]") WebElement Order;
		@FindBy(xpath = "(//i[@class='fa fa-eye'])[5]") WebElement View;
		@FindBy(xpath = "(//i[@class='fa fa-reply'])[1]") WebElement Retern;
		@FindBy(xpath = "//input[@id='input-firstname']") WebElement Firstname;
		@FindBy(xpath = "//input[@id='input-lastname']") WebElement Lastname;
		@FindBy(xpath = "//input[@id='input-telephone']") WebElement Telephone;
		@FindBy(xpath = "//input[@id='input-email']") WebElement Email;
		@FindBy(xpath = "//input[@id='input-order-id']") WebElement Orderid;
		@FindBy(xpath = "//input[@id='input-date-ordered']") WebElement Orderdate;
		@FindBy(xpath = "//input[@id='input-product']") WebElement Productname;
		@FindBy(xpath = "//input[@id='input-model']") WebElement Productcode;
		@FindBy(xpath = "//input[@id='input-quantity']") WebElement Quantity;
		@FindBy(xpath = "(//input[@name='return_reason_id'])[4]") WebElement Reasonforreturn;
		@FindBy(xpath = "(//input[@name='opened'])[1]") WebElement Productopend;
		@FindBy(xpath = "//textarea[@id='input-comment']") WebElement Faultydetails;
		@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Submit;
		@FindBy(xpath = "//a[@class='btn btn-primary']") WebElement Submit1;
		
		public T16Orderhistory() {
			PageFactory.initElements(driver, this);
		}
		
		
		public void orderreturn() throws InterruptedException, IOException {
			
			 Myaccount.click();
		        Loginbutton.click();
		        Loginemail.sendKeys(prop.getProperty("Email"));
		        LoginPassword.sendKeys(prop.getProperty("Password"));
		        Buttonlogin.click();
		        Myaccount1.click();
		        Order.click();
		        View.click();
		        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(screenshot, new File("C:\\Users\\NIRANJAN AVULA\\Niranjan-Workspace\\demoopencart\\Screenshots\\Orderhistory.PNG"));
			
		        Retern.click();
		        Thread.sleep(4000);
		        Firstname.clear();
		        Firstname.sendKeys(prop.getProperty("FirstName"));
		        Lastname.clear();
		          Lastname.sendKeys(prop.getProperty("LastName"));
		          Email.clear();
		          Email.sendKeys(prop.getProperty("Email"));
		          Telephone.clear();
		          Telephone.sendKeys(prop.getProperty("Telephone"));
		          Orderid.clear();
		          Orderid.sendKeys(prop.getProperty("Orderid"));
		          Orderdate.clear();
		          Orderdate.sendKeys(prop.getProperty("Orderdate"));
		          Productname.clear();
		          Productname.sendKeys(prop.getProperty("Productname"));
		          Productcode.clear();
		          Productcode.sendKeys(prop.getProperty("Productcode"));
		          Quantity.clear();
		          Quantity.sendKeys(prop.getProperty("Quantity"));
		          Thread.sleep(4000);
		          Reasonforreturn.click();
		          Faultydetails.sendKeys(prop.getProperty("Faultydetails"));
		          Productopend.click();
		          Submit.click();
		          Submit1.click();
		          
		          
		     
		        
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
