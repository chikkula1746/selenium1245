package MouseEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();

				//Launching the web Application
				//it is applicable for all web elements
				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


				driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

				WebElement ele1=driver.findElement(By.xpath("//*[normalize-space()='right click me']/span"));
				WebElement ele2=driver.findElement(By.xpath("//span[normalize-space()='Quit']"));
				Actions ac=new Actions(driver);


				Action act=ac.contextClick(ele1).build();
				act.perform();

				act=ac.moveToElement(ele2).build();
				act.perform();

				//		ac.contextClick(ele1).moveToElement(ele2).click().build().perform();
				//		
				driver.switchTo().alert().accept();
				driver.manage().window().fullscreen();

			}

		

	}


