package XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTables {

	public static void main(String[] args) {
		                    
		      //Launch the web browser
		       WebDriverManager.chromedriver().setup();
		       
		       WebDriver driver=new ChromeDriver();
		       
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       
		       //Launch Web application
		       
		       driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		       driver.manage().window().maximize();
		       
		     //1.How many rows in the webtable
		      // List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		       
		     //  System.out.println(rows.size());// output is 7
		       
		     //2.How many columns in webtable
		   	
		   	//List<WebElement>cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		   	
		   //	System.out.println(cols.size());
		   	
		  //3.fetch the specific row data/column data
			
			String values=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]")).getText();
			
			System.out.println(values);
			
			//4.how to fetch the column data from the webtable
			
			//List<WebElement>colvalues=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[4]"));
			 
			 
			/*for(int i=0;i<colvalues.size();i++){
				
				System.out.println(colvalues.get(i).getText());
				//5.fetch the whole data from the webtable
				
				WebElement ele=driver.findElement(By.xpath("//table[@id='customers']"));
				
				String data=ele.getText();
				System.out.println(data +"   ");*/
				
				
				//6.condition point of get the data from the webtable
				
				List<WebElement> all=driver.findElements(By.xpath("//table[@id='customers']//tr/td[2]"));
				
				for(int i=0;i<all.size();i++){
					
					String alldata=all.get(i).getText();//every element is stored in alldata reference object
					
					if(alldata.equals("Selenium")){
						
						String Contact=driver.findElement(By.xpath("//table[@id='customers']//tr[5]/td[3]")).getText();
						String Country=driver.findElement(By.xpath("//table[@id='customers']//tr[5]/td[4]")).getText();
						
						System.out.println(Contact+"  "+Country);
					}
				}
		   	
	}
	}

