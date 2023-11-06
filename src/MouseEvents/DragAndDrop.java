package MouseEvents;

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
//Launching the web Application
//it is applicable for all web elements
driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

driver.manage().window().maximize();

WebElement source1=driver.findElement(By.xpath("//div[normalize-space()='Washington'][@id='box3']"));
WebElement target1=driver.findElement(By.xpath("//div[@id='box103']"));

Actions ac=new Actions(driver);
ac.dragAndDrop(source1, target1).build().perform();

	}

}
