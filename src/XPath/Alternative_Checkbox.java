package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alternative_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).clear();//clear method
	   // driver.manage().window().maximize();
	    
	    //findElement method&sendkeys
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	     Thread.sleep(1000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		   
		 List<WebElement>all=driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 System.out.println(all.size());
		 for(int i=0;i<all.size();i=i+2) {
			// all.get(i).click();
			

	         JavascriptExecutor js=(JavascriptExecutor)driver;
	         js.executeScript("arguments[0].click();", all.get(i));   //
	         
	         Thread.sleep(3000);

	         
				//Manual Issues ==> Bug reporting 
				
				// Scripting issues  ==> Wait statements  ,, locators identification,Frames  ,, JavaScript Executor
				
				// enter into the frame
				
				//driver.switchTo().frame("framename");
				
				//exit from the frame
				
				//driver.switchTo().defaultContent();
				
				
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				// js.executeScript("arguments[0].click();,Webelement)   ==> 0==> okay, 1== Not okay
				


		 }
	}

}
