package banking.project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccount 
{
	WebDriver Driver=null;
	
	@FindBy(xpath="//a[text()='Edit Account']")
	WebElement Edit_Account;
	
	@FindBy(name="accountno")
	WebElement EAccountNo;
	
	@FindBy(name="AccSubmit")
	WebElement Submit;

	@FindBy(name="a_type")
	WebElement Account_type;	
	@FindBy(xpath="//option[@value='Savings']")
	WebElement Savings;
	
	@FindBy(name="AccSubmit")
	WebElement AccSubmit;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement Continue;
	
public EditAccount(WebDriver driver)
{
	this.Driver=driver;
	PageFactory.initElements(driver, this);	
	
}
public void Edit(String accountno,String balance )
{
	Edit_Account.click();
	EAccountNo.sendKeys(accountno);
	Submit.click();
	Account_type.click();	
	Savings.click();
	AccSubmit.click();
	Continue.click();
}
}
