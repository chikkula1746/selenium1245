package Tasks;


import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait_methodsPractice {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		 
         driver.manage().window().maximize();
       
		 driver.get("https://google.com/");
		
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Java");
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);//Enter or Return
	
			driver.findElement(By.xpath("//h3[text()='Java | Oracle']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
			//Element To Be Clickable===> clicking the button or link, radio button,check boxes
			
			WebElement ele4=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Java | Oracle']")));
		      ele4.click();
		     driver.navigate().refresh();
		      
		//VisibilityOfElementLocated()  ==> element located or not
		
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Java | Oracle']")));			
	
		     	String text=element.getText();
		
	         System.out.println(text);
			
		//TextToBePresentInElementLocated()
			
	boolean element2=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[text()='Java | Oracle']"),"Java | Oracle" ));
			
			System.out.println(element2);
			
			
			
	}

}
