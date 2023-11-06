 package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths_Types {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");

		        WebDriver driver=new ChromeDriver(); //intilized the browser
		        
		       driver.get("https://www.w3schools.com/default.asp");
		       
		       driver.manage().window().maximize();
		       
		       //Absolute Xpath
		       
             //driver.findElement(By.xpath("/html/body/div[1]/a[3]")).click();
		       
		     
		     //Relative Xpath
		     
		      //driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		      
		       
		       //X-path with Text attribute
		      
		      //driver.findElement(By.xpath("//a[text()='Not Sure Where To Begin?']")).click();
		      
		      //X-path with contains
		     driver.findElement(By.xpath("//input[contains(@placeholder,'Search our tutorials, e.g. HTML')]")).sendKeys("java");
               //X-path single Attribute
		       
		     Thread.sleep(1000);
		       driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']")).click();
		       
	}

	

}
