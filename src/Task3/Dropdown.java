package Task3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		//Launch the browser
				//System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
				       WebDriverManager.chromedriver().setup();        
				          WebDriver driver=new ChromeDriver();
				          driver.manage().window().maximize();
				          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				          //Launch the web application
				          driver.get("https://demoqa.com/text-box");
				          List<WebElement>all=driver.findElements(By.xpath("//html[1]"));
				       		
				       		int size=all.size();
				       		System.out.println(size);
	}

}
