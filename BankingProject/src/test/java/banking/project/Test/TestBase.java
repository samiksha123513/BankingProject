package banking.project.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import banking.project.Utility.ConfigData;

public class TestBase 
{
	public static WebDriver driver=null;
	public static ConfigData config=null;
		
	@BeforeSuite
	public void init()
	{
	 config = new ConfigData();
	 }
	@BeforeClass
	public void Setup()
	{
		
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	
	driver.get(config.getUrl());
	driver.manage().window().maximize();
	}

}
