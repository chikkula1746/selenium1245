package Task_WebTable1;
//2.who's name is 'Vinod' select dropdown option as pending

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
public class WebTable5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 //Launching the Web Application

		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().window().setSize(new Dimension(500,1080));
		
		List<WebElement>all=driver.findElements(By.xpath("//td[text()='Vinod']//following-sibling::td[5]/select"));
		  
		int elements=all.size();
				System.out.println(elements);
				
				for(int i=0;i<elements;i++) {
					Select sc=new Select(all.get(i));
					sc.selectByVisibleText("Pending");
					System.out.println(" Vinod is there select Pending dropdown");		

				}
						
	}

}
