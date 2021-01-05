package banking.project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer
{
	WebDriver Driver=null;
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NEw_Customer;
	/*@FindBy(name="res")
	WebElement Reset;*/
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Customer_Name;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement Gender;
	
	@FindBy(id="dob")
	WebElement DOB;
	
	@FindBy(name="addr")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="pinno")
	WebElement PIN ;
	
	@FindBy(name="telephoneno")
	WebElement Mobile_NO;
	
	@FindBy(name="emailid")
	WebElement E_Mail;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="sub")
	WebElement Submit;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement Continue;
	
		public NewCustomer(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void NewCust(String customer_Name,String Dob,String address,String city,String state,
						String pin,String mb,String email,String pass) {
		
		NEw_Customer.click();
		//Reset.click();
		Customer_Name.sendKeys(customer_Name);
		Gender.click();
		DOB.sendKeys(Dob);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		PIN.sendKeys(pin);
		Mobile_NO.sendKeys(mb);
		E_Mail.sendKeys(email);
		Password.sendKeys(pass);
		Submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Continue.click();
	}

}
