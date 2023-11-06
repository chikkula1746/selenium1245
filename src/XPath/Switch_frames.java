package XPath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_frames {

	public static void main(String[] args) {
		
		
				//1st step
				
		System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
				
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
				
				//enter into the 1st frame
				//driver.switchTo().frame(0);//index value
				//enter into the frame by using name or id
				driver.switchTo().frame("packageListFrame");
				
				driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
				System.out.println("clicking activity is completed");
				
				//exit from the 1st frame
				
				driver.switchTo().defaultContent();
				
				//enter into the 2nd frame
				
				driver.switchTo().frame(1);
				
				
				driver.findElement(By.xpath("//span[text()='Alert']")).click();
				System.out.println("link is clickable");
				
				//exit from the 2nd frame
				
				driver.switchTo().defaultContent();
				
				//enter into the 3rd frame
				
				driver.switchTo().frame(2);
				
				driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[4]/a")).click();
				System.out.println("3rd frame functionality is completed");
				
				

			}

		


	

}
