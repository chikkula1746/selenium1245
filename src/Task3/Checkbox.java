package Task3;
//Practice checkbox
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {


	public static void main(String[] args) throws InterruptedException {
		
		      //Launch the browser
		//System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
		       WebDriverManager.chromedriver().setup();        
		          WebDriver driver=new ChromeDriver();
		         // driver.manage().window().maximize();
		          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		          //Launch the web application
		          driver.get("https://demoqa.com/text-box");
		          
		          driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("SATHISH CHIKKULA");
		          driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sathishchikkula@gmail.com");
		          Thread.sleep(3000);
		          driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("H.NO:1-70,MARRUR,NAKREKAL,NALGONDA,TELANGANA,508211");
		          Thread.sleep(3000);

		          driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("H.NO:1-70,MARRUR,NAKREKAL,NALGONDA,TELANGANA,508211");
		          Thread.sleep(3000);
		          driver.findElement(By.xpath("//button[@id='submit']")).submit();
		          Thread.sleep(3000);
		          //Click on check box
		          driver.findElement(By.xpath("//li[@id='item-1']")).click();
		          Thread.sleep(3000);
		          //Select Home check box
		        
		          driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();
		          Thread.sleep(3000);
                   //Click on Radio button
		          driver.findElement(By.xpath("//span[normalize-space()='Radio Button']"));
		          WebElement element=driver.findElement(By.xpath("//span[normalize-space()='Radio Button']"));
		          Thread.sleep(3000);
		        
				  element.click();
	
		          
		          Thread.sleep(3000);
		          //Select Yes button
		          driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
	}

}
