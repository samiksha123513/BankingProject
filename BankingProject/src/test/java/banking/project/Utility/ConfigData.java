package banking.project.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigData 
{
	private Properties prope;
	
	public ConfigData() 
	{ 
		
		try {
			File f=new File(".//Config//bank.properties");
			FileInputStream fins=new FileInputStream(f);
			prope=new Properties();
			prope.load(fins);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getUrl() {
	      return prope.getProperty("url");
	}
	/*public String getkeyValue(String searchKey) {
	      return prope.getProperty(searchKey);
	}
	*/
	/*public String getEmail() {
	      return prope.getProperty("Email");
	}
*/
	public String getUserid() {
		
		return prope.getProperty("userid");
	}

	public String getpassword() {
		
		return prope.getProperty("password");
	}

public String getcustomerId() {
	
	return prope.getProperty("customerId");
}

public String getDOB() {
	
	return prope.getProperty("Dob");
}

public String getAddress() {
	return prope.getProperty("address");
	}

public String getCity() {
	return prope.getProperty("city");
}

public String getState() {
	return prope.getProperty("state");
}

public String getPIN() {
	return prope.getProperty("pin");
}

public String getMb_NO() {
	return prope.getProperty("mb");
}

public String getmail() {
	return prope.getProperty("email");
}

public String getPass() {
	return prope.getProperty("pass");
}

public String getCusid() {
	return prope.getProperty("cusid");
}

public String getMbNumber() {
	return prope.getProperty("mb_no");
}

public String getCustomerID() {
	return prope.getProperty("newAcccusid");
}

public String getIniDeposit() {
	return prope.getProperty("inideposit");
}

public String getAccountno() {
	return prope.getProperty("accountno");
}

public String getBalance() {
	return prope.getProperty("balance");
}

}
