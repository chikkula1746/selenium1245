package Selenium_All;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_All {

	public static void main(String[] args) {
		
            // System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
             
             WebDriverManager.chromedriver().setup();
             WebDriver driver =new ChromeDriver();
             
             driver.get("https://adactinhotelapp.com/Register.php");
             //Classname
             driver.findElement(By.className("reg_input")).sendKeys("Rajashekar");
             //name
             driver.findElement(By.name("password")).sendKeys("sathish1746");
             //Id
             driver.findElement(By.id("full_name")).sendKeys("Chikkula Rajashekar");
             //Tagname
             List<WebElement>all=driver.findElements(By.tagName("a"));
             System.out.println(all.size());
             
            // System.out.println(all);
             //cssSelector(Tagname[Atribute name='Atribute value']
                    
             driver.findElement(By.cssSelector("input[id='email_add']")).sendKeys("sathishchikkula@gmail.com");
             //linkText
             driver.findElement(By.linkText("Terms & Conditions")).click();
             //partialLinkText
             driver.findElement(By.partialLinkText("Terms")).click();
             
             //Xpath
             driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys("sathish1746");
             
             

             
	}

}
