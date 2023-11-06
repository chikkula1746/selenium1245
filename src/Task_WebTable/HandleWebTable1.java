package Task_WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable1 {
//3.write code if country is UK click on Know more link in next column

	public static void main(String[] args) {
		//Launch the web browser
	       WebDriverManager.chromedriver().setup();
	           WebDriver driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             //Launch Web application
	       
	            driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	                   driver.manage().window().maximize();
	                   //Following-sibling
	                   driver.findElement(By.xpath("//td[text()='UK']//following-sibling::td/a")).click();

	}

}
