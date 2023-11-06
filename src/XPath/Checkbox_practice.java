package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Checkbox_practice {

	public static void main(String[] args) {
		

	
				
				//select one specific checkbox
				
				//launching webbrowser
				//(./)==> project home directory
		System.setProperty("webdriver.chrome.driver", "C:/Users/USER/Downloads/chromedriver-win32/chromedriver.exe");

			     
				//WebDriverManager.chromedriver().setup();//setup the driver version
				WebDriver driver=new ChromeDriver();
				
				//Launching the web application
				driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
				
				//select specific checkbox
				//driver.findElement(By.xpath("//input[@name='color'][@value='orange']")).click();
				
				// 2.select all chechboxes
				
				List<WebElement>all=driver.findElements(By.xpath("//input[@name='color']"));
				// how many elements is there
				System.out.println(all.size());
				// normal for loop
//				for(int i=0;i<all.size();i++){
//					
//					all.get(i).click();
//				}
				
				//for each loop or advanced for loop or enhanced for loop
				
//				for(WebElement allcheck:all){
//					
//					allcheck.click();
//				}
				
				//select 1st two check boxes
				//6-2= 4
				
//				for(int i=0;i<2;i++){
//					
//					all.get(i).click();
//				}
				
				//select last 3 check boxes
				// 6-3=3
				
//				for(int i=0;i<all.size();i++){
//					
//					if(i>=3){
//					all.get(i).click();
//					}
//					
//				}
				
				//uncheck the check boxes
				
//				
//				for(int i=0;i<all.size();i++){
//					
//					all.get(i).click();		
//					}
//				
//				Thread.sleep(3000);
//				
//		       for(int i=0;i<all.size();i++){
//					
//		    	  if( all.get(i).isSelected()){ //true
//		    	   
//					all.get(i).click();
//		    	  }
//				}
				
				//select alternative checkboxes
				
				for(int i=0;i<all.size();i=i+3){  //i=1  i=1+2  ==>3 , i=i+2 ==5  
					
					all.get(i).click();
				}

			}


	}


