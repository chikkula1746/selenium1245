package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		
		
				
	WebDriverManager.chromedriver().setup();//setup the driver version
		WebDriver driver=new ChromeDriver();
				//Launching the Web Application
				
				driver.get("http://testingmasters.weebly.com/webtables.html");
				driver.manage().window().setSize(new Dimension(500,1080));;//stable one
				
				//where the designation as senior analyst,that related checkboxes perform clicking
				
				List<WebElement>all=driver.findElements(By.xpath("//td[text()='Senior Analyst']//preceding-sibling::td[4]/input"));

				//findout the size of the webelements
				
				int elements=all.size();
				System.out.println(elements);
				
				for(int i=0;i<elements;i++){
					
					all.get(i).click();
				}
				
			}

		


	}


