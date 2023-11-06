package Tasks;
//1.1.Verify the Registration Functionality by using absolute x-path and relative x-path

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_hyr {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
		 //Launch the web application
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		 
		  
		  //Registration Functionality with Relative Xpath
		  
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sathish");
		  Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("Chikkula");
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article/div[1]/div[1]/form/div/input[2]")).sendKeys("Chikkula");
		  Thread.sleep(2000);

		  driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article/div[1]/div[1]/form/div/input[3]")).sendKeys("sathishchikkula@gmail.com");
		  
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article/div[1]/div[1]/form/div/div[2]/input[1]")).sendKeys("Sw@thi1746");
		  Thread.sleep(2000);         
		driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/article/div[1]/div[1]/form/div/input[4]")).sendKeys("Sw@thi1746");
		Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//button[contains(@class,'btn')]")).click();
	}

}
