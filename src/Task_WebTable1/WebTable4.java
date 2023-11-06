package Task_WebTable1;
//4.where Desigantion as Manager, select the checkboxes

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		 //Launching the Web Application

		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().window().setSize(new Dimension(500,1080));
		
		List<WebElement>all=driver.findElements(By.xpath("//td[text()='Manager']//preceding-sibling::td/input"));
		
		int elements=all.size();
		System.out.println(elements);
		
		for(int i=0;i<all.size();i++) { 
			
			all.get(i).click();
		}

		System.out.println("Check box Clicking activity is completed");
	
	}

}
