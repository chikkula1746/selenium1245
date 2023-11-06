package Task_WebTable;
//1. Retrieve Sun microsystems value

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_RetriveData {

	public static void main(String[] args) {
		//Launch the web browser
	       WebDriverManager.chromedriver().setup();
	           WebDriver driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             //Launch Web application
	       
	            driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	                   driver.manage().window().maximize();
                   
	      //  WebElement ele=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[7]/td[3]"));
	        List<WebElement>all=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
	      
              
              for(int i=0;i<all.size();i++) {
     String alldata=all.get(i).getText();
     if(alldata.equals("Sun microsystems")) {
    	String Company= driver.findElement(By.xpath("//table[@id='customers']//tbody/tr[7]/td[2]")).getText();
    	
        String Country=driver.findElement(By.xpath("//table[@id='customers']//tbody/tr[7]/td[4]")).getText();
        
        System.out.println(Company+" "+Country);
     }
	

	            
	}

	}
}
