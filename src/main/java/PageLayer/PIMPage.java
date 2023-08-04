package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMPage extends BaseClass
{
	
//	@FindBy(xpath="//a[@class='oxd-main-menu-item active toggle']")
//	private WebElement pimlink;
//	

	
	
	@FindBy (xpath="(//a[@class='oxd-main-menu-item'])[2]")
	private WebElement pimlink;
	
//	@FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
//	private WebElement addemp;
	
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addemp;
	
	@FindBy(name="firstName")
	private WebElement FirstName;
	
	
	@FindBy(name="middleName")
	private WebElement MiddleName;
	
	
	@FindBy(name="lastName")
	private WebElement LastName;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement SaveBtn;
	
	
	
	
	public  PIMPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addEmpFuncationality(String fname, String mname, String lname)
	{
		FirstName.sendKeys(fname);
		MiddleName.sendKeys(mname);
		LastName.sendKeys(lname);
		
	}
	
	public void pimLink()
	{
		pimlink.click();	
	}
	
	public void addEmployee()
	{
		addemp.click();
	}
	public void SaveButton()
	{
		SaveBtn.click();
	}
}
