package XPath;

import java.time.Duration;
import java.util.function.Function;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitMethods {

	public static void main(String[] args) {
		//Launch the browser
		//System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
          WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    
		   driver.manage().window().maximize();
		    driver.get("https://google.com/");
		    
		    
		                // Set up Fluent Wait
			Wait<WebDriver>wait=new FluentWait<>(driver)
		                .withTimeout(Duration.ofSeconds(30))
		                .pollingEvery(Duration.ofMillis(500))
		                .ignoring(TimeoutException.class);

			
			 //perform some functionality on the web application
	        
	        driver.findElement(By.name("q")).sendKeys("selenium");
	        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);//Enter or Return
	        
	        //define the condtion you want to wait for
	        
	      WebElement ele4=  driver.findElement(By.xpath("//a[text()='WebDriver']"));
	        
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='WebDriver']")));
	        
	        
	        
	        
	        // Define the condition you want to wait for
	       WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='About Selenium']")));
	        //get the text
	     String text=element.getAttribute("href");
	     System.out.println(text);
	        //perform some actions
	        
	        element.click();
	        
	        // Close the browser
	       // driver.close();
	        
	      // driver.quit();
	
	}
	

}
