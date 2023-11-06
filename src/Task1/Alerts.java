package Task1;
//4.write scripts to handlie alerts /popups(https://the-internet.herokuapp.com/javascript_alerts)

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		//Launch the web browser
				System.setProperty("webdriver,chrome.driver","C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe" );

				   WebDriver driver=new ChromeDriver();
				   
				   driver.manage().window().maximize(); //maximize window
				   
				   driver.get("https://the-internet.herokuapp.com/javascript_alerts");

				  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
				   
				 //intialization  Simple alert
					Alert a=driver.switchTo().alert();
					System.out.println(a.getText());
	
					a.accept(); 
					Thread.sleep(3000);
		         //Intialization of PROMPT ALERT
	              driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				
	              System.out.println(a.getText());
					 a.sendKeys("Yes");
				    a.accept();
					//a.dismiss();  
				    Thread.sleep(3000);
				   //Confirmation alert
	           driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
				    System.out.println(a.getText());
				     a.accept();
					//a.dismiss();
	}

}
