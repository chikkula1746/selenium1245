package Selenium_All;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMthods {

	public static void main(String[] args) {
		//Launch the Browser
				//System.setProperty("webdriver,chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
				
					WebDriverManager.chromedriver().setup();
					WebDriver driver=new ChromeDriver();
					//Launch the Webapplication
				driver.get("https://inputs.kalgudi.com/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//FindElement&Click
				driver.findElement(By.xpath("//span[text()='Login']")).click();
				
				//sendkeys
				driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("sathishchikkula@gmail.com");
				
				//findElements
			List<WebElement>all=driver.findElements(By.xpath("//span[text()='All categories']"));
	System.out.println(all.size());
	
	for(int i=0;i<all.size();i++) {
		System.out.println(all.get(i).getText());

	}
	
	}
			
			
	}


