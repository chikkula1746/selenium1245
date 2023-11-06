package Tasks;
//1.Verify the Login Functionality with valid credential's By using X-paths with Attributes

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("http://183.82.103.245/nareshit/login.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@class='loginText']")).sendKeys("admin");
		 
	     driver.findElement(By.xpath("//input[@name='txtPassword'][@class='loginText']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).click();
	 
	 Thread.sleep(2000);
		 
	 String Exp_Result="OrangeHRM";
		
		
	 if(Exp_Result.equals(driver.getTitle())){
		 System.out.println("Login is completed");
	 }
	 else{
		 System.out.println("Login is failed");

		 
		 
	 }	 
		 
		 
	}

}
