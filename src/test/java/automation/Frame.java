package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe")));
////		driver.switchTo().frame(1);
////		driver.switchTo().frame("iframeresult");
//        driver.findElement(By.xpath("//*[@type='submit']")).click();
//        //System.out.println(text);
		
		/*driver.get("https://ui.vision/demo/webtest/frames/");
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("hello");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("hi");*/
		try
		{
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		al.sendKeys("hello");
		}
		finally
		{
			driver.quit();
		}
	}

}
