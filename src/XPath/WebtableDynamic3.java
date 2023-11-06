package XPath;
//try this program for check all checkboxes

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableDynamic3 {

	public static void main(String[] args) throws InterruptedException {
		//Launching the we browser
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
	
				//Launching the web Application
		//it is applicable for all web elements
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		
		driver.manage().window().maximize();
		
		//login functionality
		
		driver.findElement(By.id("input-username")).sendKeys("demo");

		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){  //true/false
			
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
			Thread.sleep(3000);
			
			//Customers  ==>customer
			
			driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
			
			driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
			
			
			String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
			
			System.out.println(text);

			int no_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
			
			System.out.println(no_pages);
			
			//how many rows is available for every page
			
			for(int i=1;i<=11;i++){
				
				if(no_pages>1){   //1501  >1 ==>enter into conodtions
					
					;
					//how many active pages is there that we have printed in console window
				try{	
				 WebElement ele1=	driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+i+"]"));
					
				System.out.println(ele1.getText());
				Thread.sleep(2000);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", ele1);
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				
				}
				
			
			
			driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//input[@type='checkbox']")).click();
		}
			}
		}
	}
}
	


