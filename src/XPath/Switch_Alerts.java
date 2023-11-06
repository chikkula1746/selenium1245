package XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Alerts {

	public static void main(String[] args) {
	         //Step-1 Launch Browser
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
               //step-2  Launch the web application
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/delete_customer.php");
				
				
				driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Satti@1746");
			
			driver.findElement(By.xpath("//input[@name='submit']")).click();
				
			//some Implicit wait condition
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//intialization alert
				Alert a=driver.switchTo().alert();
				String text=a.getText();
				System.out.println(text);
				
				//Handling Confirmation Alert
				a.accept();
				
				//Handling simple Alert
				//Thread.sleep(3000);
				a.accept();
				
	
			}

		}

