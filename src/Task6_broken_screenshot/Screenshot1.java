package Task6_broken_screenshot;
import java.io.File;
import java.io.IOException;
//1.Write a code for capture Full screenshot("https://hubilo.com")
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.get("https://hubilo.com");
		   driver.manage().window().maximize();
		 //Takes Screenshot full page
			
	TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);//only takes the screenshot
		File target=new File("./Screenshots/wholepage.png");//store the screen shot specified location
	FileUtils.copyFile(source, target);
		System.out.println("screenhot is taken");
		WebElement area=driver.findElement(By.xpath("//div[@class='accelerate-img is_on_desktop']//*[name()='svg']//*[name()='g' and contains(@clip-path,'url(#__lot')]//*[name()='g'][1]/*[name()='g'][1]/*[name()='path'][2]"));
	
	File source1=area.getScreenshotAs(OutputType.FILE);//takes screenshot
	File target1=new File("./Screenshots/Area.png");
	FileUtils.copyFile(source1, target1);
	System.out.println("screenshot is taken");
	
	
	/*WebElement ele1=driver.findElement(By.xpath("//div[@class='navigation-container-mob']//div[@class='logo']"));
    Thread.sleep(3000);
	File source2=ele1.getScreenshotAs(OutputType.FILE);
	File target2=new File("./Screenshots/Element.png");
	
	FileUtils.copyFile(source2, target2);
	System.out.println("screenshot is taken");*/
		     
	}

}
