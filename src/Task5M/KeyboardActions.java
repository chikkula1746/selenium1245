package Task5M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://text-compare.com/");
	    
	    driver.manage().window().maximize();
	    
	    	driver.findElement(By.xpath("//*[@id='compareButton']/div[1]")).click();
	   
	    	driver.findElement(By.xpath("//*[@id='textCompareForm']/div/table/tbody/tr/td[3]/button")).click();
	    		
	  WebElement ele3=driver.findElement(By.id("inputText1"));
	    		ele3.sendKeys("Laxmi nilayam,Balaji nagar,road no:5,Kothapet,500035");
	    		
	    		Actions ac=new Actions(driver);
	    		
	 
	    		
	    		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	    		
	    		
	    		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    		
	    		ac.sendKeys(Keys.TAB).perform();
	    		
	 
	    		
	    		ac.keyDown(Keys.CONTROL).sendKeys("v").perform();
	    		
	    		
	    		
	    		
	    		
	    		
	    		

	    	}

	    


	

}
