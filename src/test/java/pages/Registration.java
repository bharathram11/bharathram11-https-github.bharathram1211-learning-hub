package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement text_user;
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement text_pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement text_login;
	
	public void username(String user)
	{
		text_user.sendKeys(user);
	}
	public void pass(String pass)
	{
		text_pass.sendKeys(pass);
	}
	public void  click()
	{
		text_login.click();
	}
}
