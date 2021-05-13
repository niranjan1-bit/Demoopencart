package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Baseclass;


public class T001Registaration extends Baseclass {
	
	@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount; 
	
	@FindBy(xpath = "//a[contains(.,'Register')]")  WebElement Register;
	
	@FindBy(xpath = "//input[@id='input-firstname']")  WebElement firstname;
	@FindBy(xpath = "//input[@id='input-lastname']")  WebElement LAstName;
	@FindBy(xpath = "//input[@id='input-email']")  WebElement Email;
	@FindBy(xpath = "//input[@id='input-telephone']")  WebElement TelePhone;
	@FindBy(xpath = "//input[@id='input-password']")  WebElement PAssword;
	@FindBy(xpath = "//input[@id='input-confirm']")  WebElement PasswoRdConfirm;
	@FindBy(xpath = "//input[@name='agree']") WebElement Checkbox;
	@FindBy(xpath = "//input[contains(@class,'btn btn-primary')]") WebElement Continue;
	public T001Registaration( ) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
		
		 public void createaccount() throws InterruptedException {
		        Myaccount.click();
		        Thread.sleep(4000);
		        Register.click();
		        firstname.sendKeys(prop.getProperty("FirstName"));
		       LAstName.sendKeys(prop.getProperty("LastName"));
		       Email.sendKeys(prop.getProperty("Email"));
		       
		       TelePhone.sendKeys(prop.getProperty("Telephone"));
		       PAssword.sendKeys(prop.getProperty("Password"));
		       PasswoRdConfirm.sendKeys(prop.getProperty("Password"));
		       Checkbox.click();
		        Continue.click();
	
		 }
	
}
