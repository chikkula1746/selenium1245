package Task_WebTable;
//2. write code if country is UK click on checkbox

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static void main(String[] args) {
		//Launch the web browser
	       WebDriverManager.chromedriver().setup();
	           WebDriver driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             //Launch Web application
	       
	            driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	                   driver.manage().window().maximize();
	                   //preceding-sibling 
	           		driver.findElement(By.xpath("//td[text()='UK']//preceding-sibling::td[3]/input")).click();


	}

}
