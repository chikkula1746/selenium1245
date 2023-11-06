package Task_WebTable;
//4.write a code if country is USA click on Know more Link

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebtable3 {

	public static void main(String[] args) {
		//Launch the web browser
	       WebDriverManager.chromedriver().setup();
	           WebDriver driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             //Launch Web application
	       
	            driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	                   driver.manage().window().maximize();
	                   //Following-sibling
	           List<WebElement>all=driver.findElements(By.xpath("//td[text()='USA']//following-sibling::td/a"));
	           
	           for(int i=0;i<all.size();i++)
	        	   
	        	  all.get(i).click();
	              driver.navigate().back();
	            
	        	   
	}

}
