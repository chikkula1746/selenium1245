package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.function.Function;

public class ExplicitWaitConditions {

	public static  void main(String[] args) {
		//Launch the browser
				//System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
				    WebDriver driver=new ChromeDriver();
				    
				   driver.manage().window().maximize();
				    driver.get("https://www.google.com/");
				    
				    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("software Testing");
					driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);//Enter or Return
					
					driver.findElement(By.xpath("//h3[text()='What is Software Testing and How Does it Work? - IBM']"));
					WebDriverWait wait=new WebDriverWait(driver, 10);
					//Element To Be Clickable===> clicking the button or link, radio button,check boxes
					
				//WebElement ele5=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='What is Software Testing and How Does it Work? - IBM']")));
				
			//ele5.click();
					
					//VisibilityOfElementLocated()  ==> element located or not
					
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='What is Software Testing and How Does it Work? - IBM']")));
//					
			String text=element.getText();
//					
			System.out.println(text);
					
					//TextToBePresentInElementLocated()
					
					boolean element2=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[text()='What is Software Testing and How Does it Work? - IBM']"),"What is Software Testing and How Does it Work? - IBM" ));
					
				System.out.println(element2);
					
					
	}

}
