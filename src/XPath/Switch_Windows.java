package XPath;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Switch_Windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
				WebDriver driver=new ChromeDriver();
				
				//implicit wait statement 
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
				
				//capture the window ids
				
				String window=driver.getWindowHandle();
				System.out.println(window);
				
				//capture window ids
				
				//Approach-1  collection topic
				
				Set<String>windowids=driver.getWindowHandles();
				
			// convert set to list
				
				List<String>WindowsIDS=new ArrayList(windowids);
				
				String parentID=WindowsIDS.get(0);
				System.out.println(parentID);
				
				String childWindow=WindowsIDS.get(1);
				System.out.println(childWindow);
				
				driver.switchTo().window(childWindow);
				
				driver.findElement(By.xpath("//input[@name='action_request']")).click();
				System.out.println("click activity is completed");
				
				driver.switchTo().window(parentID);
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

			}

		



	}


