package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Innerframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		     //Enter into the 1st frame
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("seleniumtool");
		    //Exit the 1st frame
		driver.switchTo().defaultContent();
		   //Enter the 2nd frame
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Webdriver");
		 //Exit the 2nd frame
		driver.switchTo().defaultContent();
		   //Enter the 3rd frame
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("SeleniumWebdriver");
		
		//enter into the inner frame 		
		driver.switchTo().frame(0); 
	driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div")).click();
		
		
		 //Exit the 3rd frame
		driver.switchTo().defaultContent();
		   //Enter the 4th frame
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Tester");

	}

}
