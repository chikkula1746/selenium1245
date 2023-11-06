package Task_WebTable1;
//1.who's designation as a 'Analyst',fetch their Emailid's.

import java.util.List;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable2 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			 //Launching the Web Application

			driver.get("http://testingmasters.weebly.com/webtables.html");
			
			List<WebElement>all=driver.findElements(By.xpath("//td[text()='Analyst']//preceding-sibling::td[1]"));
			

			for(int i=0;i<all.size();i++){
				
				String Text=all.get(i).getText();
				
				System.out.println(Text);


	}
			System.out.println("Analyst all Email ID's completed");
}
}
