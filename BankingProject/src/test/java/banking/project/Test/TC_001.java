package banking.project.Test;



import org.testng.annotations.Test;

import banking.project.Page.HomePage;

public class TC_001 extends TestBase
{
	@Test
	public void VisitTest()
	{
	HomePage page=new HomePage(driver);
	page.visit();
	}
}
