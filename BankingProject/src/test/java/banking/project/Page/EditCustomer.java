package banking.project.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer 
{
	WebDriver Driver=null;
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement Edit_Customer;
	
	@FindBy(name="cusid")
	WebElement Customer_ID;
	
	@FindBy(name="AccSubmit")
	WebElement Submit;
	
	@FindBy(name="telephoneno")
	WebElement Mb;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement Home;
	
		public EditCustomer(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);	
	}
		public void Edit_Customer(String cusid,String mb_no)
		{
			Edit_Customer.click();
			Customer_ID.sendKeys(cusid);
			Submit.click();
			Mb.sendKeys(mb_no);
			Home.click();
		}

}
