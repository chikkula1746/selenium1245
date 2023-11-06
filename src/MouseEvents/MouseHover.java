package MouseEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				
				//Launching the web Application
				//it is applicable for all web elements
				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
				driver.get("https://www.orangehrm.com/");
				
				driver.manage().window().maximize();
				
				WebElement ele=driver.findElement(By.xpath("//*[normalize-space()='Solutions']"));
				WebElement ele1=driver.findElement(By.xpath("//body/nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div[@class='container-fluid']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']/li[@class='nav-item']/div[@class='secondary']/div[@class='col-md-12 col-lg-12']/div[@class='sub-menu']/div[@class='secondary-menu']/ul/li[1]"));
				
				
				Actions ac=new Actions(driver);
				//ac.moveToElement(ele).moveToElement(ele1).click().build().perform();
				//at a time you have to perform multiple actions
				//build method==> create the action
				ac.moveToElement(ele).moveToElement(ele1).click().perform(); //perform action
				System.out.println("people management option clicking activity is completed");
				

			}

		

	}


