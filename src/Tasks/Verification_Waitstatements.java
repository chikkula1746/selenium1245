package Tasks;
//3.Verify the Login Functionalirty by usig all wait statements ("https://adactinhotelapp.com/index.php")


import java.util.concurrent.TimeUnit;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class Verification_Waitstatements {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
				 WebDriver driver =new ChromeDriver();
				 
				 //Implicit wait
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
				 
				 //Launch the web application
				 driver.get("https://adactinhotelapp.com/index.php");
				 Thread.sleep(2000);
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
				  

				  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mahesh23456");
				  
				  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("India@123");
				  Thread.sleep(2000);
				  
				  driver.findElement(By.id("login"));
				WebElement ele=driver.findElement(By.id("login"));				
				WebDriverWait wait=new WebDriverWait(driver,15);
				  
				 wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
				 
				 Thread.sleep(2000);
				 
					String Exp_Result="Adactin.com - Search Hotel";

					
					
				 if(Exp_Result.equals(driver.getTitle())){
					 System.out.println("Login is  completed");
				 }
				 else{
					 System.out.println("Login is failed");

				 
				 }		 
	}

}
