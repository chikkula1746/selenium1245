package MouseEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Launching the web Application
		//it is applicable for all web elements
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		WebElement xdir=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println(xdir.getLocation());
        WebElement x_dir=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        System.out.println(x_dir.getLocation());
        
        Actions ac=new Actions(driver);
        
        ac.dragAndDropBy(xdir, 100, 250).build().perform();
        
        System.out.println("after moving ....  " + xdir.getLocation());
        
        ac.dragAndDropBy(x_dir, -100, 250).build().perform();
        System.out.println("after moving.... " + x_dir.getLocation());

	}

}
