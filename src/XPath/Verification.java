package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login.php/");
		 
		 
		 //Enter valid username and valid password
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9542551863");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8074558755");
		 
		 //click on the login button
		 driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		 
		 String Exp_Result="Facebook";
			
			
		 if(Exp_Result.equals(driver.getTitle())){
			 System.out.println("Testcase is Passesd");
		 }
		 else{
			 System.out.println("testcase is failed");
		 }
	}
	

}
