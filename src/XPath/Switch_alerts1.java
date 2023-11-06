package XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_alerts1 {

	public static void main(String[] args) {
		
				//Step-1 Launch Browser
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		             driver.manage().window().maximize();
						
					
						driver.get("https://the-internet.herokuapp.com/javascript_alerts");
						
						driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
						
						//iNITIALIZATION OF ALERT
						
						Alert a=driver.switchTo().alert();
						
						
					     String text=a.getText();
					     System.out.println(text);
						
						a.sendKeys("Yes");
					a.accept();
						//a.dismiss();
						
						
					
						
						
				
						
						

			}

	


	}
