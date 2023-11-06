package Task2;
//2nd task you will enter some content on the content box, and using all the menu's by using frames concept
//http://the-internet.herokuapp.com/iframe

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Innerframes {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait statement 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	driver.get("http://the-internet.herokuapp.com/iframe");
	//Enter into the inner frame
	      //driver.switchTo().frame(0);
	      
	      //driver.findElement(By.xpath("//body[@id='tinymce']")).click();
	      WebElement iframe = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(iframe);
			
			
			// clear the content and input new text:
			WebElement editor=driver.findElement(By.xpath("//body[@id='tinymce']"));
			
			editor.clear();
			editor.sendKeys("Hello, this is Selenium inner frame");
			//Switch Back to Default Content:

			driver.switchTo().defaultContent();

	     
	}

}
