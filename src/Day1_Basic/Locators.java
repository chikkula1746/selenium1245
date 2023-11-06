package Day1_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static WebDriver driver;
	public static void main(String[] args) {
	
		 driver=new ChromeDriver();
			//navigated to the webpage or open the webpage
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");

		         
		         driver.get("https://adactinhotelapp.com/Register.php");
		         //we are using different types locators 
		         //classname
		         driver.findElement(By.className("reg_input")).sendKeys("sathish");
		         // name Locator
		         
		         driver.findElement(By.name("password")).sendKeys("Satti1746");
		         //ID locator
		          
		          driver.findElement(By.id("password")).sendKeys("Satti1746");
		          
		          //Tagname:
	 // List< WebElement> ele= driver.findElements(By.tagName("a"));
	 // System.out.println(ele.size());
	  
	                  //System.out.println(ele);
		         
		       // Class selector(TAGNAME[ATTRIBUTE='ATTRIBUTEVALUE']
		         
		        driver.findElement(By.cssSelector("input[id='full_name']")).sendKeys("SathishCH");
		        //6.LinkText()
		        // driver.findElement(By.linkText("Terms & Conditions")).click();
		        // Partial LinkText()
		         
		        driver.findElement(By.partialLinkText("Terms")).click();
		         
		         //X-path:
		          // //Tagname[@Attribute='attributevalue']
		         driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("Satti1746");
	}

}
