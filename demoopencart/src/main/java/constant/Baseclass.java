package constant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.MapReduceCommand.OutputType;

public class Baseclass {
	
	public static WebDriver driver;
    public static Properties prop;
    //static PopupWindow popup;
    
    public Baseclass() {
         
            prop = new Properties();
            FileInputStream file;
            try {
                file = new FileInputStream("C:\\Users\\NIRANJAN AVULA\\Niranjan-Workspace\\demoopencart\\src\\main\\java\\config\\config.propertiesfile");
                prop.load(file);
            
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
    public static void initialization() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRANJAN AVULA\\Desktop\\New folder\\chromedriver_win32 (2)\\chromedriver.exe" );
        driver = new ChromeDriver();
    
    
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        

 

        
        
        driver.get(prop.getProperty("url"));
    
        
        /*try {
            Thread.sleep(10000);
            } catch (InterruptedException e) {
            
            e.printStackTrace();
            }
            driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
            try {
            Thread.sleep(10000);
            } catch (InterruptedException e) {
            
            e.printStackTrace();
            }*/
   
    }
    
}
        

	



