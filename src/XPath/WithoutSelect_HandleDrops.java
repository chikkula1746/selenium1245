package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelect_HandleDrops {

	public static void main(String[] args) {
		
		
			
						WebDriverManager.chromedriver().setup();
						WebDriver driver=new ChromeDriver();
			
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
						
						driver.findElement(By.xpath("//select[@id='country-list']")).click();
				
						List<WebElement>all=driver.findElements(By.xpath("//select[@id='country-list']/option"));
						
						for(int i=0;i<all.size();i++){
							
							String values=all.get(i).getText();
							
							if(values.equals("Brazil1") & values.equals("China")|| values.equals("India")){
								
								all.get(i).click();
							}
							
							//BOTH CONDITIONS is satisfiesd ==true
							//one true /another conditon is false ==false
							
						}
						
						

			}

		



	}


