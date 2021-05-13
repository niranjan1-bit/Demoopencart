package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Baseclass;

public class T008Plaseorderregisteraccount extends Baseclass {
	
	

	
	
		
		
		
		@FindBy(xpath = "(//a[contains(.,'Laptops & Notebooks')])[1]") WebElement Laptops;
		@FindBy(xpath = "//a[contains(.,'Show All Laptops & Notebooks')]") WebElement Showalllaptops;
		@FindBy(xpath = "(//span[contains(.,'Add to Cart')])[1]") WebElement Hplaptop;
		@FindBy(xpath = "//input[@id='input-option225']") WebElement Datefuture;
		@FindBy(xpath = "//button[@id='button-cart']") WebElement Addcart;
		@FindBy(xpath = "//span[@id='cart-total']") WebElement Itembasket;
		@FindBy(xpath = "//strong[contains(.,'Checkout')]") WebElement Checkout;
		@FindBy(xpath = "(//input[@name='account'])[1]") WebElement Register;
		
		@FindBy(xpath = "//input[@id='button-account']") WebElement Continue4;
		
		@FindBy(xpath = "//input[@id='input-payment-firstname']") WebElement Firstname;
		@FindBy(xpath = "//input[@id='input-payment-lastname']") WebElement Lastname;
		@FindBy(xpath = "//input[@id='input-payment-telephone']") WebElement Telephone;
		@FindBy(xpath = "//input[@id='input-payment-email']") WebElement Email2;
		@FindBy(xpath = "//input[@id='input-payment-password']") WebElement Password1;
		@FindBy(xpath = "//input[@id='input-payment-confirm']") WebElement Password2;
		
		@FindBy(xpath = "//input[@id='input-payment-company']") WebElement Company;
		@FindBy(xpath = "//input[@id='input-payment-address-1']") WebElement Address1;
		@FindBy(xpath = "//input[@id='input-payment-address-2']") WebElement Address2;
		@FindBy(xpath = "//input[@id='input-payment-city']") WebElement City;
		@FindBy(xpath = "//input[@id='input-payment-postcode']") WebElement Postalcode;
		@FindBy(xpath = "//select[@id='input-payment-country']") WebElement Country;
		@FindBy(xpath = "//select[@id='input-payment-zone']") WebElement State;
		
		@FindBy(xpath = "//input[@name='agree']") WebElement Checkbox;
		@FindBy(xpath = "//input[@id='button-register']") WebElement Continue;
		@FindBy(xpath = "//input[@id='button-shipping-address']") WebElement Continue0;
		//@FindBy(xpath = "//input[contains(@id,'button-shipping-address')]") WebElement Continue1;
		
		@FindBy(xpath = "//textarea[@name='comment']") WebElement Comments;
		@FindBy(xpath = "//input[@id='button-shipping-method']") WebElement Continue2;
		@FindBy(xpath = "//input[contains(@name,'agree')]") WebElement Terms;
		@FindBy(xpath = "//input[@id='button-payment-method']") WebElement Continue3;
		
		
		@FindBy(xpath = "//input[@id='button-confirm']") WebElement Placeorder;
		
		
		
		public T008Plaseorderregisteraccount() {
			PageFactory.initElements(driver, this);
		}
		
		 public void orderregisteraccount() throws InterruptedException {
			
		      
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
		          Register.click();
		          Thread.sleep(4000);
		          Continue4.click();
		          Thread.sleep(4000);
		         
		         
		         
		          
		          Firstname.sendKeys(prop.getProperty("FirstName"));
		          Lastname.sendKeys(prop.getProperty("LastName"));
		          Email2.sendKeys(prop.getProperty("Email2"));
		          Telephone.sendKeys(prop.getProperty("Telephone"));
		          Password1.sendKeys(prop.getProperty("Password1"));
		          Password2.sendKeys(prop.getProperty("Password2"));
		          Company.sendKeys(prop.getProperty("Company"));
		          Address1.sendKeys(prop.getProperty("Address1"));
		          Address2.sendKeys(prop.getProperty("Address2"));
		          City.sendKeys(prop.getProperty("City"));
		          Postalcode.sendKeys(prop.getProperty("Postalcode"));
		          Country.sendKeys(prop.getProperty("Country"));
		          Thread.sleep(4000);
		          State.sendKeys(prop.getProperty("State"));
		          Thread.sleep(4000);
		         
		          Checkbox.click();
		          Thread.sleep(4000);
		          Continue.click();
		         
		          
		          Thread.sleep(4000);
		          Continue0.click();
		          Thread.sleep(4000);
		         // Continue1.click();
		          //Thread.sleep(4000);
		          
		    
		          Comments.sendKeys(prop.getProperty("Comments"));
		          Thread.sleep(4000);
		          Continue2.click();
		         
		          Thread.sleep(4000);
		          Terms.click();
		          Thread.sleep(4000);
		          Continue3.click();
		          Thread.sleep(4000);
		         
		          Thread.sleep(4000);
		          Placeorder.click();
		          
		          
		          
			 }      
		          
		        

		
		

}
