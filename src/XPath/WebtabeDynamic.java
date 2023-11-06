package XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtabeDynamic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	   	    		
	    		//Launching the web Application
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
	    		
	    		driver.manage().window().maximize();
	    		
	    		//perform the Login functionality
	    		
	    		driver.findElement(By.id("input-username")).sendKeys("demo");
	    		driver.findElement(By.id("input-password")).sendKeys("demo");
	    		
	    		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    		
	    		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){//true or false
	    			
	    			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	    		}
	    		
	    		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
	    		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
	    		
	    		
	    		
	    		//find how many pages available on the dynamic webtable
	    		
	    		 String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	    		
	    		 System.out.println(text);
	    		 //Showing 1 to 10 of 17 (2 Pages)//string
	    		 
	    		// string values we have convert into int    paresInt()==> String values into INT
	    		 
//	    		  int pages = Integer.parseInt(text.indexOf("(")+1,text.indexOf("pages")-1);
	    		 //you find out the index value
	    		 int pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
	    		 
	    		 System.out.println(pages);//2
	    		 
	    		 
	    		 //find out the how many rows is available on those pages
	    		 
	    		 for(int i=1;i<=pages;i++){
	    			 
	    			 if(pages>1){
	    				 
	    				 WebElement active_pages=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+i+"]"));
	    				 System.out.println(active_pages.getText());
	    				 
	    				 JavascriptExecutor js=(JavascriptExecutor)driver;
	    				 js.executeScript("arguments[0].click();", active_pages);
	    				 
	    				
	    				 
	    			 }
	    			 
	    			 //find out the no of rows in webtable
	    			 
	    			int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
	    			 
	    			System.out.println(rows);//print the size of the rows
	    			
	    			
	    			//fetch the data from the webtable
	    			
	    			for(int r=1;r<rows;r++){
	    				
	    				
//	    				String data=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[3]")).getText();
//	    			
//	    			System.out.println(data);
	    			
	    			 String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[4]")).getText();
	    			 
	    			 System.out.println(customer);
	    			}
	    		 }
	    		 
	    		 
	    		
	    		

	    	}

	    


	}


