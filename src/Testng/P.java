package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class P {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("vghavhgfvhgvfdhgvfhg");
		driver.findElement(By.name("firstname")).sendKeys("hgfdhhfjffavh");
		String t = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"gdshjgjkkjgkjhgfhjgfhhkjhhk");
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
		s.assertAll();
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
