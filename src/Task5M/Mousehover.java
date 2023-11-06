package Task5M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://www.lambdatest.com/automation-demos");
	    
	    driver.manage().window().maximize();
	    
	                  WebElement ele1=driver.findElement(By.xpath("//button[normalize-space()='Developers']"));
	       WebElement ele11= driver.findElement(By.xpath("//p[normalize-space()='Run first Selenium test on LambdaTest Grid']"));


	              Actions ac=new Actions(driver);
	              
					ac.moveToElement(ele1).moveToElement(ele11).click().perform(); //perform action
					System.out.println("selenium option clicking activity is completed");

	}

}
