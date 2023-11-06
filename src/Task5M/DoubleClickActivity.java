package Task5M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickActivity {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://www.lambdatest.com/selenium-playground/");
	    
	    driver.manage().window().maximize();
	    
	    WebElement ele1=driver.findElement(By.xpath("//h1[text()='Selenium Playground']"));
	    
	      Actions ac=new Actions(driver);
	      ac.doubleClick(ele1).build().perform();
	      System.out.println("double click activity is completed");

	    
	}

}
