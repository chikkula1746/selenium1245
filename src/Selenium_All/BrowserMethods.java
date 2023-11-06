package Selenium_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods {

	public static void main(String[] args) {
		//Launch the Browser
		System.setProperty("webdriver,chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			//Launch the Webapplication
			
			driver.get("https://inputs.kalgudi.com/");//getStringUrl
			
			//getCurrenturl
			System.out.println(driver.getCurrentUrl());
			//getTitle
			System.out.println(driver.getTitle());
			//getPagesource
			//System.out.println(driver.getPageSource());
			
			driver.close();
			
			//driver.quit();
			
			

	}

	
	}


