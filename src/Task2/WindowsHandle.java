package Task2;
//Search, Opening links, switch to browser windows, capture titles, close all browser windows
//https://testautomationpractice.blogspot.com/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait statement 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//Search
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("software");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/form/div/span[2]/span[2]/input")).click();
	
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		System.out.println(driver.getWindowHandles());
		
		
		
		//Approach-1  collection topic
		
		Set<String>windowids=driver.getWindowHandles();
		
	// convert set to list
		
		List<String>Windows=new ArrayList(windowids);
		
		String parentwindow=Windows.get(0);
		
		
		String childWindow=Windows.get(1);
		
		//Enter into the chaildwindow
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Macbook");
		driver.findElement(By.xpath("//button[@type='button']")).click();

		
		System.out.println("Clicking activity is completed");
		//Enter into the parentwindow
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8074558755");
		
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
		
		System.out.println("All Browsers are closed");
		
	}

}
