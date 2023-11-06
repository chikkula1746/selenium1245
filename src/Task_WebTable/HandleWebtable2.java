package Task_WebTable;
//5.Write a Code if contact is  Sun Microsystems  click on checkbox

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebtable2 {

	public static void main(String[] args) {
		//Launch the web browser
	       WebDriverManager.chromedriver().setup();
	           WebDriver driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             //Launch Web application
	       
	            driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	                   driver.manage().window().maximize();
	                   //preceding-sibling 
	           		driver.findElement(By.xpath("//td[text()='Sun microsystems']//preceding-sibling::td[2]/input")).click();
	}

}
