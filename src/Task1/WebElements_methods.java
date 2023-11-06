package Task1;
//2.use all the webElement methods (https://adactinhotelapp.com/)
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );

		   WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);//Implicit wait 
		   
		   driver.manage().window().maximize(); //maximize window
		   
		   driver.get("https://adactinhotelapp.com/");
		   
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mahesh23456"); 
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("India@123");
			
			//driver.findElement(By.xpath("//input[@name='username']")).clear();//clear method
			
			
			driver.findElement(By.xpath("//input[@id='login']")).click();
			
			driver.findElement(By.xpath("//input[contains(@name,'Submit')]"));
		     Thread.sleep(1000);
		   
		  
		    WebElement ele= driver.findElement(By.xpath("//input[contains(@name,'Submit')]"));
		   
		    
		    System.out.println(ele.getLocation());
		    Thread.sleep(1000);
		  
		
			   
			    System.out.println(ele.isDisplayed());//isDisplayed method
			    System.out.println(ele.isEnabled());//isEnabled method
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//input[contains(@name,'Submit')]"));
			    Thread.sleep(1000);
			WebElement ele4=driver.findElement(By.xpath("//input[contains(@name,'Submit')]"));
			   ele4.isSelected();
			 
			System.out.println(ele4.isSelected());
			   
			   //getCss value
			   System.out.println(ele.getCssValue("width"));
			  System.out.println(ele.getTagName());
			   //getAttribute
			   Thread.sleep(1000);
			  driver.findElement(By.linkText("Change Password"));
		 WebElement ele5=driver.findElement(By.linkText("Change Password"));
		 System.out.println(ele5.getAttribute("href"));
			
			 Thread.sleep(2000);

			  List<WebElement>ele2=driver.findElements(By.xpath("//select[@id='location']"));
			 System.out.println(ele2.size());
			    Thread.sleep(2000);

		   for(int i=0;i<ele2.size();i++) {
		  System.out.println(ele2.get(i).getText());
		    }
		  
		
		 
		  
	

	}			

	

}
