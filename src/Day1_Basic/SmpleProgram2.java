package Day1_Basic;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmpleProgram2 {
    static WebDriver driver;//static variable
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
               //initialization of Webdriver.
		//WebDriver driver=new ChromeDriver();   //its applicable for all drivers
		//ChromeDriver driver=new ChromeDriver();//ChromeDriver class
		//driver.get("https:/www.google.com/");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		             WebDriver driver=new FirefoxDriver();
		             System.setProperty("webdriver.firefox.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		        driver.get("https:/www.google.com/");
		             
		              //Browser Methods
		            // get()==>open the web page
		            // driver.get("https:/www.google.com/");
		             //getCurrentURL()==>read the current URLof the web page
		             
		             //System.out.println(driver.getCurrentUrl());
		             
		             //getTitle()==>get the title of the web page
		             
		           System.out.println(driver.getTitle());
		             
		             //close();==>close the current window
		             
		             //driver.close();
		             //quit()==>closes current window as well as associated windows
		             
		  //driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/a[2]/img")).click();
		             //driver.close();
		             
		             //getPagesource()==>get the source of webpage
		             
		          // System.out.println(driver.getPageSource());
		             
		             
		             
	}

}
