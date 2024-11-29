package automation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Registration;

public class Test1 {
	
	WebDriver driver;
	@BeforeMethod
	void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test
	void test()
	{
		Registration rg=new Registration(driver);
		rg.username("Admin");
		rg.pass("admin123");
		rg.click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
	
}
