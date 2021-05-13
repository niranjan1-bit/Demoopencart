package pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import constant.Baseclass;

public class T004VerifyTheTitle extends Baseclass {
	
public T004VerifyTheTitle() {
	PageFactory.initElements(driver, this);
}
	
	public void verifytitle() {
	String actual = driver.getTitle();
	//Reporter.log(actual);
	System.out.println(actual);
	
	String expected= prop.getProperty("Actualtitel");
	//Reporter.log(expected);
	

	Assert.assertEquals(actual, expected,"Title matched");
	}

}
