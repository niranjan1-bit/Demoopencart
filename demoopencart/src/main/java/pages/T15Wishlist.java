package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constant.Baseclass;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
public class T15Wishlist extends Baseclass {
	
	@FindBy(xpath = "(//a[contains(@class,'dropdown-toggle')])[4]") WebElement Components;
	@FindBy(xpath = "//a[contains(.,'Monitors (2)')]") WebElement Monitors;
	@FindBy(xpath = "(//label[@class='input-group-addon'])[1]") WebElement Sortby;
	@FindBy(xpath = "//select[@id='input-sort']") WebElement Sorby1;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]") WebElement Wish;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[4]")WebElement Wishlist;
	@FindBy(xpath = "//input[@id='input-email']") WebElement Loginemail;
	@FindBy(xpath = "//input[@id='input-password']") WebElement LoginPassword;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']") WebElement Buttonlogin;
	
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]") WebElement Addcart;
	
	public T15Wishlist() {
		PageFactory.initElements(driver, this);
	}
	
	public void Listwish() throws InterruptedException, IOException {
		
		 Actions actions = new Actions(driver);
		 actions.moveToElement(Components).perform();
		 System.out.println("Done Mouse hover on 'Components' from Menu");
		Thread.sleep(4000);
		 Monitors.click();
		 Sortby.click();
		 Select dropdown = new Select(driver.findElement(By.id("input-sort")));  
		 dropdown.selectByIndex(4); 
		 Thread.sleep(4000);
		 Wish.click();
		 Thread.sleep(4000);
		 Wishlist.click();
		 Thread.sleep(4000);
	        Loginemail.sendKeys(prop.getProperty("Email"));
	        LoginPassword.sendKeys(prop.getProperty("Password"));
	        Buttonlogin.click();
	        Thread.sleep(4000);
	        Addcart.click();
	        
	       
	        
		 
		 
		 
	}
	
	
	
	
}
