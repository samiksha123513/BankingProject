package banking.project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver Driver=null;
	
	/*@FindBy(xpath="//a[text()='here']")
	WebElement Visit_here;

	@FindBy(name="emailid")
	WebElement EmailID;
	
	@FindBy(name="btnLogin")
	WebElement Submit;
*/	
	@FindBy(name="uid")
	WebElement UserID;
	
	@FindBy(name="password")
	WebElement Password;
	
	public HomePage(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);	
	}
	/*public void visit(String Email)
	{
		Visit_here.click();	
		EmailID.sendKeys(Email);
		Submit.click();s
		
	}*/
	public void Login(String userid,String password)
	{
		UserID.sendKeys(userid);
		Password.sendKeys(password);
	}
}
