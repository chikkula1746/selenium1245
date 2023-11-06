package Task5M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {

	public static void main(String[] args) {
		https://www.hubilo.com/
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		   driver.get("https://www.hubilo.com/");
		    
		    driver.manage().window().maximize();
			//scrolling down by using pixel( 0,1700)
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
//			JavascriptExecutor jse=driver; it is applicable only webdriver class (chromedriver,firefoxdriver)

	//jse.executeScript("window.scrollBy(0,750);", "");
	//System.out.println(jse.executeScript("return window.pageYOffset;"));
			
			//scrolling down the page to the element present
			
			//identify the element
			WebElement ele1=driver.findElement(By.xpath("//a[text()='Request a Demo']"));
			
	jse.executeScript("arguments[0].scrollIntoView();", ele1);
	System.out.println(jse.executeScript("return window.pageYOffset;"));
			
			//scroll down end of the page 
			
			/*jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			System.out.println(jse.executeScript("return window.pageYOffset;"));
			Thread.sleep(3000);
			//go back to initial stage
			jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			System.out.println(jse.executeScript("return window.pageYOffset;"));*/
			
			
			


	}

}
