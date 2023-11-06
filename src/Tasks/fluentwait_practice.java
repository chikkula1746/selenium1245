package Tasks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentwait_practice {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 
         driver.manage().window().maximize();
       
		 driver.get("https://google.com/");
		 
		 //setup FluentWait
		 
		FluentWait<WebDriver>wait=new FluentWait<>(driver);
      wait.withTimeout(Duration.ofSeconds(40));
         wait.pollingEvery(Duration.ofMillis(600));
         wait.ignoring(TimeoutException.class);
         
         driver.findElement(By.name("q")).sendKeys("selenium programs");
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);//Enter or Return
	        
	      //define the condtion you want to wait for
	       WebElement ele8= driver.findElement(By.xpath("//h3[text()='Selenium Webdriver Java Program Example (Sample Code)']"));
	        
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Selenium Webdriver Java Program Example (Sample Code)']")));
	
	
          // Define the condition you want to wait for
  	      // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Write your first Selenium script']")));
  	        //get the text
  	     //String text=element.getAttribute("class");
  	    // System.out.println(text);
  	 //perform some actions
	        
	        ele8.click();
	        
	        // Close the browser
	       // driver.close();
	        
	       driver.quit();
	
	}

}
