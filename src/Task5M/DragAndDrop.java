package Task5M;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    
	    driver.manage().window().maximize();
	    

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	    
	    WebElement ele1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	    WebElement ele2= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	    WebElement ele3=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	    WebElement ele4=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

	    WebElement ele22=driver.findElement(By.xpath("//div[@id='trash']"));
	    
	    Actions ac=new Actions(driver);
	    ac.dragAndDrop(ele1, ele22).build().perform();
	    ac.dragAndDrop(ele2, ele22).build().perform();
        ac.dragAndDrop(ele3, ele22).build().perform();
        ac.dragAndDrop(ele4, ele22).build().perform();



	    
	}

}
