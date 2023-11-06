package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		//Launched the browser
		
		     Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		    WebDriver driver =new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).clear();//clear method
		   // driver.manage().window().maximize();
		    
		    //findElement method&sendkeys
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		     Thread.sleep(1000);
		     //findElement method&click() method
		     driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]"));
		     Thread.sleep(1000);
		   
		  
		    WebElement ele= driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]"));
		   
		    
		    System.out.println(ele.getLocation());
		    Thread.sleep(1000);
		    ele.click();
		  WebElement ele1= driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?v=1689053487449']"));
			   
			    System.out.println(ele1.isDisplayed());//isDisplayed method
			    System.out.println(ele1.isEnabled());//isEnabled method
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p']")).isSelected();
			    Thread.sleep(1000);
				  WebElement ele4=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p']"));
			    ele4.isSelected();
			 
			  System.out.println(ele4.isSelected());
			   
			   //getCss value
			   System.out.println(ele1.getCssValue("width"));
			   System.out.println(ele1.getTagName());
			   //getAttribute
			   Thread.sleep(1000);
			   WebElement ele3=driver.findElement(By.linkText("Performance"));
			   System.out.println(ele3.getAttribute("href"));
			 
			    Thread.sleep(1000);

			   List<WebElement>ele2=driver.findElements(By.xpath("//div[@class='orangehrm-todo-list']"));
			 System.out.println(ele2.size());
			    Thread.sleep(1000);

		   for(int i=0;i<ele2.size();i++) {
		   System.out.println(ele2.get(i).getText());
		    }
		  
		
		 
		  
	}

	
		
	}  
	



