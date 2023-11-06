package XPath;
//Dropdown
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				//Launching the WebApplication
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
				
				driver.manage().window().maximize();
			
				driver.findElement(By.xpath("//b[@class='caret']")).click();
				
				//identify the list of elements
				
				List<WebElement>all=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label"));
				
				int alldrops=all.size();
				
				System.out.println(alldrops);
				
				for(int i=0;i<all.size();i++){
					
					String text=all.get(i).getText();
					
					if(text.equalsIgnoreCase("Jquery")||text.equalsIgnoreCase("angular") || text.equals("Java")){
						
						all.get(i).click();
					}
				
				
				}
	}
}


		



	


