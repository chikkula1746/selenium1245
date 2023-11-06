package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable02 {

	public static void main(String[] args) {
		//who's designation as Senior analyst,fetch their user names
		
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			

			//Launching the Web Application

			driver.get("http://testingmasters.weebly.com/webtables.html");
			
		
		List<WebElement>all=driver.findElements(By.xpath("//td[text()='Senior Analyst']//preceding-sibling::td[2]"));
					
					//td[text()='Senior Analyst']//preceding-sibling::td[2]
					for(int i=0;i<all.size();i++){
						
						String Text=all.get(i).getText();
						
						System.out.println(Text);
		
					
					
					
					

				}

			}



	}


