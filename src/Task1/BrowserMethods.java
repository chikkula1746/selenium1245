package Task1;
//1.use all the webbrowser methods in this webapplication(https://adactinhotelapp.com/)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		//Launch the web browser
		System.setProperty("webdriver,chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );

		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize(); //maximize window
		   
		   //Launch the web application
		   //get(String URL)
		   
		   driver.get("https://adactinhotelapp.com/");
		   
		   //getCurrentUrl()
		   System.out.println(driver.getCurrentUrl());
		  
		   //getTitle()
		   System.out.println(driver.getTitle());
		   
		   //getPageSource()
		   System.out.println(driver.getPageSource());
		   
		   Thread.sleep(2000);
		   
		   //close()
		   driver.close();
		   
		   //quit()
		   driver.quit();
		   
		   
	}

}
