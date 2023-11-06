package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kalgudi_Input_Store {

	public static void main(String[] args) throws InterruptedException {

		//Launch the web browser
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     //Launch web application
		     
		     driver.get("https://inputs.kalgudi.com/");
		     //click login button
		     driver.findElement(By.xpath("//span[text()='Login']")).click();
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("sathishchikkula@gmail.com");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("SATHISH");
		     driver.findElement(By.xpath("//span[text()='REGISTER']")).click();
	}

}
