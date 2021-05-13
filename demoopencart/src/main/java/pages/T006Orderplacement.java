package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Baseclass;

public class T006Orderplacement extends Baseclass {
	
	
@FindBy(xpath = "//span[contains(.,'My Account')]")  WebElement Myaccount; 
	
	@FindBy(xpath = "(//a[contains(.,'Login')])[1]") WebElement Loginbutton;
		
		@FindBy(xpath = "//input[@id='input-email']") WebElement Loginemail;
		@FindBy(xpath = "//input[@id='input-password']") WebElement LoginPassword;
		
		@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Buttonlogin;
		
		
		@FindBy(xpath = "(//a[contains(.,'Laptops & Notebooks')])[1]") WebElement Laptops;
		@FindBy(xpath = "//a[contains(.,'Show All Laptops & Notebooks')]") WebElement Showalllaptops;
		@FindBy(xpath = "(//span[contains(.,'Add to Cart')])[1]") WebElement Hplaptop;
		@FindBy(xpath = "//input[@id='input-option225']") WebElement Datefuture;
		@FindBy(xpath = "//button[@id='button-cart']") WebElement Addcart;
		@FindBy(xpath = "//span[@id='cart-total']") WebElement Itembasket;
		@FindBy(xpath = "//strong[contains(.,'Checkout')]") WebElement Checkout;
		@FindBy(xpath = "//input[@id='button-payment-address']") WebElement Gustcheckout;
		@FindBy(xpath = "(//input[@name='payment_address'])[2]") WebElement Newaddress;
		@FindBy(xpath = "//input[@id='input-payment-firstname']") WebElement Firstname;
		@FindBy(xpath = "//input[@id='input-payment-lastname']") WebElement Lastname;
		@FindBy(xpath = "//input[@id='input-payment-company']") WebElement Company;
		@FindBy(xpath = "//input[@id='input-payment-address-1']") WebElement Address1;
		@FindBy(xpath = "//input[@id='input-payment-address-2']") WebElement Address2;
		@FindBy(xpath = "//input[@id='input-payment-city']") WebElement City;
		@FindBy(xpath = "//input[@id='input-payment-postcode']") WebElement Postalcode;
		@FindBy(xpath = "//select[@id='input-payment-country']") WebElement Country;
		@FindBy(xpath = "//select[@id='input-payment-zone']") WebElement State;
		@FindBy(xpath = "//input[@id='button-payment-address']") WebElement Continue;
		
		@FindBy(xpath = "//input[@id='button-shipping-address']") WebElement Continue2;
		@FindBy(xpath = "//textarea[contains(@name,'comment')]") WebElement Comments;
		@FindBy(xpath = "//input[@id='button-shipping-method']") WebElement Continue3;
		@FindBy(xpath = "//input[contains(@name,'agree')]") WebElement Terms;
		@FindBy(xpath = "//input[@id='button-payment-method']")WebElement Continue1;
		@FindBy(xpath = "//input[@id='button-confirm']") WebElement Placeorder;
		
		public T006Orderplacement() {
			PageFactory.initElements(driver,this);
		}
		
		 public void order() throws InterruptedException {
		
		 Myaccount.click();
	        Loginbutton.click();
	        Loginemail.sendKeys(prop.getProperty("Email"));
	        LoginPassword.sendKeys(prop.getProperty("Password"));
	        Buttonlogin.click();
	        Actions actions = new Actions(driver);
			 actions.moveToElement(Laptops).perform();
			
	         Showalllaptops.click();
	         Hplaptop.click();
	         Thread.sleep(4000);
	         Datefuture.clear();
	         Datefuture.sendKeys(prop.getProperty("Datefuture"));
	          Addcart.click();
	          Thread.sleep(4000);
	          Itembasket.click();
	          Thread.sleep(4000);
	          Checkout.click();
	          Thread.sleep(4000);
	          Newaddress.click();
	         
	         
	          
	          Firstname.sendKeys(prop.getProperty("FirstName"));
	          Lastname.sendKeys(prop.getProperty("LastName"));
	          Company.sendKeys(prop.getProperty("Company"));
	          Address1.sendKeys(prop.getProperty("Address1"));
	          Address2.sendKeys(prop.getProperty("Address2"));
	          City.sendKeys(prop.getProperty("City"));
	          Postalcode.sendKeys(prop.getProperty("Postalcode"));
	          Country.sendKeys(prop.getProperty("Country"));
	          State.sendKeys(prop.getProperty("State"));
	          Continue.click();
	          Thread.sleep(4000);
	          Continue2.click();
	          Thread.sleep(4000);
	          Comments.sendKeys(prop.getProperty("Comments"));
	          Thread.sleep(4000);
	         Continue3.click();
	         Thread.sleep(4000);
	          Terms.click();
	          Thread.sleep(4000);
	          Continue1.click();
	          Thread.sleep(4000);
	          Placeorder.click();
	          
	          
	          
	          
		 }      
	          
	        
		
		
		
}
