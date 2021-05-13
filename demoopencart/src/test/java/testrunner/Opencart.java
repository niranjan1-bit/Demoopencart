package testrunner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constant.Baseclass;
import pages.T001Registaration;
import pages.T002RegisterAccountFailure;
import pages.T003Login;
import pages.T004VerifyTheTitle;
import pages.T005Tabmouseover;
import pages.T006Orderplacement;
import pages.T007Existingloginaccount;
import pages.T008Plaseorderregisteraccount;
import pages.T15Wishlist;
import pages.T16Orderhistory;


public class Opencart extends Baseclass {
	
	T001Registaration Reg;
	T002RegisterAccountFailure Reg1;
	T003Login Reg2;
	T004VerifyTheTitle Reg3;
	T005Tabmouseover Reg4;
	T006Orderplacement Reg5;
T007Existingloginaccount Reg6;
T008Plaseorderregisteraccount Reg8;
T16Orderhistory Reg9;
T15Wishlist Reg10;


	public Opencart( ) {
		super();
		
	}
	
	@BeforeMethod
	public void setup( ) throws InterruptedException {
		initialization();
		Reg = new T001Registaration();
		Reg1 = new T002RegisterAccountFailure();
		Reg2 = new T003Login();
		Reg3= new T004VerifyTheTitle();
		Reg4 = new T005Tabmouseover();
		Reg5= new T006Orderplacement();
		Reg6= new T007Existingloginaccount();
		Reg8= new T008Plaseorderregisteraccount();
		Reg9= new T16Orderhistory();
		Reg10= new T15Wishlist();
	}
	
	
	@Test(enabled = false, priority = 1)
	public void TC_01() throws InterruptedException {
		
		Reg.createaccount();
	
		
	}
	
	@Test(enabled = false,priority = 2)
	public void TC_02() throws InterruptedException, IOException {
		Reg1.createaccountwithouttelephonenumber();
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("C:\\Users\\NIRANJAN AVULA\\Niranjan-Workspace\\demoopencart\\Screenshots\\withoutnumber.PNG"));
	}
	
	@Test(enabled =false,priority = 3)
	public void TC_03() throws InterruptedException {
		Reg2.clickLogin();

	}
	@Test(enabled = false,priority = 4)
	public void TC_04() {
		Reg2.clickLogin();
		Reg3.verifytitle();
		
	}
	
	@Test(enabled = false,priority = 5)
	public void TC_05() {
		
		Reg4.Book();
	}
	

	@Test(enabled = false,priority = 6)
	public void TC_06() throws InterruptedException {
		
		Reg5.order();
	}
	
	@Test(enabled = false,priority = 7)
	public void TC_07() throws InterruptedException {
		Reg6.Changelastname();
	}


	@Test(enabled = false,priority = 8)
	public void TC_08() throws InterruptedException {
		Reg8.orderregisteraccount();
}

	@Test(enabled = false,priority = 9)
	public void TC_09() throws InterruptedException, IOException {
	
		Reg9.orderreturn();
	
}
	@Test(enabled = true,priority = 10)
	public void TC_10() throws InterruptedException, IOException {
	Reg10.Listwish();
	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshot, new File("C:\\Users\\NIRANJAN AVULA\\Niranjan-Workspace\\demoopencart\\Screenshots\\Shoppingcard.PNG"));


}
	  @AfterTest 
      public void closeDriver() { 
         driver.close();
}

}
