package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Links {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).clear();//clear method
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	     Thread.sleep(1000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	   List<WebElement>all= driver.findElements(By.tagName("a"));
	   int links=all.size();
	   
	   System.out.println(links);

	   for(int i=0;i<all.size();i++) {
		   String text=all.get(i).getText();
		   System.out.println(text);
	   }

	}

}
