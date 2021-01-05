package banking.project.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banking.project.Page.EditAccount;
import banking.project.Page.EditCustomer;
import banking.project.Page.HomePage;
import banking.project.Page.NewAccount;
import banking.project.Page.NewCustomer;


public class TC_001 extends TestBase
{
	/*@Test(priority=1)
	public void VisitTest()
	{
	HomePage page=new HomePage(driver);
	
	page.visit(config.getEmail());
	driver.navigate().back();
	driver.navigate().back();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}*/
	
	@Test(priority=1)
	public void LoginPage()
	{
		HomePage page1=new HomePage(driver);
		page1.Login(config.getUserid(),config.getpassword());
	}
	
	@Test(priority=2)
	public void NewCustomertest()
	{
		NewCustomer customer=new NewCustomer(driver);
		customer.NewCust(config.getcustomerId(),config.getDOB(),config.getAddress(),config.getCity(),config.getState(),
					config.getPIN(),config.getMb_NO(),config.getmail(),config.getPass());

	}
	@Test(priority=3)
	public void Edit_Customertest()
	{
		EditCustomer editcustmer=new EditCustomer(driver);
		editcustmer.Edit_Customer(config.getCusid(),config.getMbNumber());
		
	}
	@Test(priority=4)
	public void New_Account()
	{
		NewAccount newacc=new NewAccount(driver);
		newacc.New_Account(config.getCustomerID(),config.getIniDeposit());
		
	}
	
	@Test(priority=5)
	public void Edit()
	{
		EditAccount edit=new EditAccount(driver);
		edit.Edit(config.getAccountno(),config.getBalance());
		
				
	}
}
