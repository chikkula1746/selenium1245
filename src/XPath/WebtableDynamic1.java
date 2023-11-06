package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableDynamic1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
	    driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){//true or false
			
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		/* String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
 		
		 System.out.println(text);
		
		 int pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		 
		 System.out.println(pages);//2
		 
		 
		 //find out the how many rows is available on those pages
		 
		 for(int i=1;i<=pages;i++){
			 
			 if(pages>1){
				 
				 WebElement active_pages=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+i+"]"));
				 System.out.println(active_pages.getText());
				 
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", active_pages);*/
				 
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
	 
	System.out.println(rows);//print the size of the rows
	for(int r=1;r<=rows;r++){

	
	String rowsdata=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[" +r+  "]")).getText();
	
	System.out.println(rowsdata);}
	int coloms= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[1]/td")).size();
	 
	System.out.println(coloms);//print the size of the coloms

	for(int c=1;c<=coloms;c++){

	String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[" +c+  "]/td[4]")).getText();
	System.out.println(customer);
	
	String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[" +c+  "]/td[5]")).getText();
	System.out.println(status);
	String Total=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[" +c+  "]/td[6]")).getText();
	System.out.println(Total);
	String Dateadded=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[" +c+  "]/td[7]")).getText();
	System.out.println(Dateadded);
	
		
	}
		
	}
		 

	}

