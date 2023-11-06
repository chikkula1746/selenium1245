package Task1;
//3.use all wait statements and verify the login functionality(https://adactinhotelapp.com/)

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatements {


	public static void main(String[] args) throws InterruptedException {
		           //Launch the web browser
				System.setProperty("webdriver,chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );

				   WebDriver driver=new ChromeDriver();
				   driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);//Implicit wait 
				   
				   driver.manage().window().maximize(); //maximize window
				   
				   driver.get("https://adactinhotelapp.com/");
				   
				   //setup Fluent wait
				   FluentWait<WebDriver>wait=new FluentWait<>(driver);
				   
				   wait.withTimeout(Duration.ofSeconds(30));
				   wait.pollingEvery(Duration.ofMillis(500));
				   wait.ignoring(TimeoutException.class);
				   
				   //Verify the Login functionality
				   
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mahesh23456"); 
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("India@123");
			
			
			driver.findElement(By.xpath("//input[@id='login']"));
			
			
			WebElement ele=driver.findElement(By.xpath("//input[@id='login']"));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='login']")));
			// Define the condition you want to wait for
	  	      // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='login']")));
	  	        //get the text
	  	    // String text=element.getAttribute("class");
	  	    // System.out.println(text);
		
		WebDriverWait wait1=new WebDriverWait(driver,15);
			  
		 wait1.until(ExpectedConditions.elementToBeClickable(ele)).click();
		 
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


