package Task6_broken_screenshot;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.get("https://hubilo.com");
		   driver.manage().window().maximize();
		     
		   List<WebElement>all=driver.findElements(By.tagName("a"));
			System.out.println(all.size());
			
			int brokenlinks=0;
			for(WebElement alllinks:all){
				
				String links=alllinks.getAttribute("href");
			System.out.println(links);
				
				
				if(links==null ||links.isEmpty( )){  //pre-requisite
					
					System.out.println("href attribute is emepty");
					continue;
				}
			
				  URL linkurl=new URL(links);
				 
				 HttpURLConnection connection=(HttpURLConnection) linkurl.openConnection();
				 connection.connect();//server is connected
				 
				 if(connection.getResponseCode()>=400){
					 
					 System.out.println(alllinks.getText() + " ---- Broken link");
					 brokenlinks++;
				 }
				 //else{
					 //System.out.println(alllinks.getText() + " ---- it is not a Broken link");
				 //}
			}
 
	}

}
