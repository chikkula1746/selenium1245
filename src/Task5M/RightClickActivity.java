package Task5M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickActivity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://www.lambdatest.com/automation-demos");
	    
	    driver.manage().window().maximize();
	    
	      WebElement ele1=driver.findElement(By.xpath("//button[normalize-space()='Book a Demo']"));
			Actions ac=new Actions(driver);


			Action act=ac.contextClick(ele1).build();
		     act.perform();
			Thread.sleep(1000);
			//act.m
	    



	}

 

}
