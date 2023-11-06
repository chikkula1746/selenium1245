package XPath;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
		//System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32 (1)/chromedriver-win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		 
		 //Implicit wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		 driver.get("https://www.facebook.com/login.php/");
		 
		 
		      //navigate method
		 
		// driver.navigate().to("https://www.facebook.com/login.php/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?ars=facebook_login')]"));
		 
		 
		// driver.findElement(By.id("email")).sendKeys("9542551863");
		//	driver.findElement(By.id("pass")).sendKeys("8074558755");
			
		   // Thread.sleep(2000);
		 
		// driver.findElement(By.id("loginbutton"));
	//WebElement ele=driver.findElement(By.id("loginbutton"));
	//WebDriverWait wait=new WebDriverWait(driver,10);

		 WebElement ele= driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?ars=facebook_login')]"));
		 WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();

            
	
	   Thread.sleep(2000);
		 
		driver.navigate().back();
	System.out.println(" back ward Functionality completed");
		 
		Thread.sleep(2000);
		 
	driver.navigate().forward();
      System.out.println("forward Functionality completed");
		 
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 System.out.println("Refresh Functionality completed");
		 
		 
		 
	}

}
