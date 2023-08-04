package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void loginfunctionality(String Username,String Password)
	{
		uname.sendKeys(Username);
		pass.sendKeys(Password);
	}
	public void clickbutton()
	{
		loginbutton.click();
	}
}
