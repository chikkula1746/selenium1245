package Task_WebTable1;
//3.who's Designation is 'Manager' fetch their Employe ID

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 //Launching the Web Application

		driver.get("http://testingmasters.weebly.com/webtables.html");
         
		List<WebElement>all=driver.findElements(By.xpath("//td[text()='Manager']//preceding-sibling::td[3]"));
		int elements=all.size();

		System.out.println(elements);
		    
		
		for(int i=0;i<all.size();i++) {
			
			String Text=all.get(i).getText();
			
			
			System.out.println(Text);

		}
		System.out.println("Manager Employee ID's completed");
	}

}
