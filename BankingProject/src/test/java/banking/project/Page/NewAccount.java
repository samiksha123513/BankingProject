package banking.project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount 
{  
	WebDriver Driver=null;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement New_Account;
	
	@FindBy(name="cusid")
	WebElement cusid;
	
	@FindBy(name="selaccount")
	WebElement Account_type;	
	@FindBy(xpath="//option[@value='Current']")
	WebElement Current;
	
	@FindBy(name="inideposit")
	WebElement Inideposit;	
	
	@FindBy(name="button2")
	WebElement Submit;	
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement Continue;
	
		public NewAccount(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);	
	}
		public void New_Account(String newAcccusid,String inideposit)
		{
			New_Account.click();
			cusid.sendKeys(newAcccusid);
			Account_type.click();
			Current.click();
			Inideposit.sendKeys(inideposit);
			Submit.click();
			Continue.click();
		}

}
