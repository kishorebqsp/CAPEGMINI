package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tiger {
	
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
	}
	
	@Test(priority=2)
	public void login()
	{
		
		String t = driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}


