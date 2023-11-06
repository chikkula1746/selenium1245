package XPath;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		     WebDriverManager.chromedriver().setup();
		       WebDriver driver=new ChromeDriver();

				//launch the webapplication
				driver.get("https://www.orangehrm.com/");
				driver.manage().window().maximize();
				
				//Take screenshot use 3 ways ( 1.takes screenshot whole page)==applicable for only before selenium 4 & after selenium4 it's supported
				//2.take screenshot particular area  ==> it is supported only selenium 4
				// 3.takes screenshot for particular element
				
				//Takes Screenshot full page
				
//			TakesScreenshot ts=(TakesScreenshot)driver;
//				File source=ts.getScreenshotAs(OutputType.FILE);//only takes the screenshot
//				File target=new File("./Screenshots/wholepage.png");//store the screen shot specified location
//				FileUtils.copyFile(source, target);
//				System.out.println("screenshot is taken");
				
				//Takes Screenshot particular area
				
//				WebElement area=driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-8 col-sm-12 homepage-slider-content-section']"));
//				
//				File source=area.getScreenshotAs(OutputType.FILE);//takes screenshot
//				File target=new File("./Screenshots/area11.png");
//				FileUtils.copyFile(source, target);
//				System.out.println("screenshot is taken");
				
				//Takes Screenshot particular element
				
				WebElement ele1=driver.findElement(By.xpath("//img[@src='https://test-website.orangehrm.com/assets/Uploads/icons/language/uk-flag.png']"));
				
				//takes screenshot
				File source11=ele1.getScreenshotAs(OutputType.FILE);
				//set the location of storing the screenshot
				File target=new File("./Screenshots/element.png");
				//storing gthe element source to target location
				
				FileUtils.copyFile(source11, target);
				System.out.println("screenshot is taken");
				
				
				
				

			}

		

	}


