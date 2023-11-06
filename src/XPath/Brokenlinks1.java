package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks1 {

	public static void main(String[] args) throws IOException {
		
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();

						//launch the webapplication
						driver.get("http://www.deadlinkcity.com/");
						driver.manage().window().maximize();
						
						List<WebElement>all=driver.findElements(By.tagName("a"));
						System.out.println(all.size());
						
						int brokenlinks=0;
						for(WebElement alllinks:all){
							
							String links=alllinks.getAttribute("href");
							System.out.println(links);
							//pre-requisite
							if(links==null ||links.isEmpty( )){
								
								System.out.println("href attribute is emepty");
								continue;
							}
							
							//connect to the server
							//string value converted into URL format
							  URL linkurl=new URL(links);
							  
							  //send the request to the server
							  //open the connection, connect to the server
							 HttpURLConnection connection=(HttpURLConnection) linkurl.openConnection();
							 //server is connected
							 connection.connect();
							 
							 if(connection.getResponseCode()>=400){
								 
								 System.out.println(alllinks.getText() + " ---- Broken link");
								 brokenlinks++;//increment the brokenlinks
							 }
							 else{
								 System.out.println(alllinks.getText() + " ---- it is not a Broken link");//good links
							 }
						}

			}

		
			

	

}
