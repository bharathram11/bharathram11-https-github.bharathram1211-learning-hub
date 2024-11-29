package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

public class Test112
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 40, 1000);
		WebSiteUtility.launchSite(driver,"http://www.gmail.com");
		//Locate and operate elements
		wait.until(waitandfill(By.name("identifier"),"magnitiait"));
		wait.until(waitandclick(By.xpath("//span[text()='Next']/parent::button")));
		//ws.closeSite(driver);
	}
	
	public static ExpectedCondition<Boolean> waitandclick(By b)
	{
		//Use Anonymous class concept to create an object to interface
		ExpectedCondition<Boolean> ec=new ExpectedCondition<Boolean>() 
		{
	        public Boolean apply(WebDriver driver) 
	        {
	        	try 
	           	{
	        	   driver.findElement(b).click();
	        	   return(true);
	            } 
	            catch(Exception ex) 
	            {
	            	return(false);
	            }
	         }
	    };
	    return(ec);
	}
		
	public static ExpectedCondition<Boolean> waitandfill(By b, String x)
	{
		//Use Anonymous class concept to create an object to interface
		ExpectedCondition<Boolean> ec=new ExpectedCondition<Boolean>() 
		{
	            public Boolean apply(WebDriver driver) 
	            {
	            	try 
	            	{
	            		driver.findElement(b).sendKeys(x);
	            		return(true);
	            	} 
	            	catch(Exception ex) 
	            	{
	            		return(false);
	            	}
	            }
	    };
	    return(ec);
	}
}
