package XPath;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable01 {

	public static void main(String[] args) {
		
			//who's designation as a Analyst ,their status as converted into Cancelled
				
		      WebDriverManager.chromedriver().setup();//setup the driver version
				WebDriver driver=new ChromeDriver();
				

				//Launching the Web Application

				driver.get("http://testingmasters.weebly.com/webtables.html");
				driver.manage().window().setSize(new Dimension(500,1080));

				//

				List<WebElement>all=driver.findElements(By.xpath("//td[text()='Analyst']//following-sibling::td[3]/select"));
		        // how many web elements is there
				int elements=all.size();

				System.out.println(elements);

				for(int i=0;i<=elements;i++){

					Select sc=new Select(all.get(i));//0 1, 2,3,4,5,6,

					sc.selectByIndex(1);// selectByvisibletext,select by value
					System.out.println("dropdowns selecting activity is completed");
				}

			}

		}


	


