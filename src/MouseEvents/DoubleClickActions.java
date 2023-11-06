package MouseEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickActions {

	public static void main(String[] args) {
						WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				
				//Launching the web Application
				//it is applicable for all web elements
				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
				
				
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
				
				driver.manage().window().maximize();
				//enter into the frame
				driver.switchTo().frame("iframeResult");
				
		       WebElement ele1= driver.findElement(By.xpath("//input[@id='field1']"));
		       ele1.clear();
		       ele1.sendKeys("Testing");
		       
		       WebElement ele3=driver.findElement(By.xpath("//*[@id='field2']"));
		        
		      WebElement ele2= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		      
		      Actions ac=new Actions(driver);
		      ac.doubleClick(ele2).build().perform();
		      System.out.println("double click activity is completed");
		      System.out.println(ele3.getText());
		      
			}

		

	

}
