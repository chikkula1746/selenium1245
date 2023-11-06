package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.*;
public class Handle_Dropdown {

	 static public void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

       
       		WebElement ele=driver.findElement(By.xpath("//select[@id='country-list']"));
       		
       		Select sc=new Select(ele);
       		
       		//using different types of approaches
       		//1.select by visible text
       		
     	sc.selectByVisibleText("India");
     		Thread.sleep(3000);
     		//selectby index
    	 /* sc.selectByIndex(5);
    	   Thread.sleep(3000);
    		//select by value
    	  sc.selectByValue("3");*/
WebElement ele2=driver.findElement(By.xpath("//select[@id='state-list']"));
       		
       		Select sc1=new Select(ele2);
       		Thread.sleep(3000);
       		sc1.selectByVisibleText("Delhi");
       		Thread.sleep(3000);
       		sc1.selectByIndex(2);
       		Thread.sleep(3000);
       		sc1.selectByValue("21");
       		
List<WebElement>all1=driver.findElements(By.xpath("//select[@id='state-list']/option"));
       		
       		int size=all1.size();
       		System.out.println(size);
       //foreach loop
       		
       		for(WebElement Dropdown:all1){
       			Dropdown.click();
       			Thread.sleep(1000);
       			String drop=Dropdown.getText();
       			System.out.println(drop);
       		
       	/*List<WebElement>all=driver.findElements(By.xpath("//select[@id='country-list']/option"));
       		
       		int size=all.size();
       		System.out.println(size);
       		
       		//foreach loop
       		
       		for(WebElement alldrops:all){
       			alldrops.click();
       			Thread.sleep(1000);
       			String alldrop=alldrops.getText();
       			System.out.println(alldrop);*/
       		}
       		
	 }	
	 }	

       	





        

	


