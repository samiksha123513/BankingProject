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

}
