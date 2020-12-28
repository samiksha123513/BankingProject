package banking.project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver Driver=null;
	
	@FindBy(xpath="//a[text()='here']")
	WebElement Visit_here;

	
	public HomePage(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void visit()
	{
		Visit_here.click();	
	}
}
