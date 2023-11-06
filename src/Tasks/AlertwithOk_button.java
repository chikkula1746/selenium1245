package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithOk_button {

	public static void main(String[] args) {
                    //Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");
	
	             WebDriver driver=new ChromeDriver();
	             //Maximize the window
	             driver.manage().window().maximize();
	
	             //Launch the web application
	             driver.get("https://demo.automationtesting.in/Alerts.html");
	}

}
