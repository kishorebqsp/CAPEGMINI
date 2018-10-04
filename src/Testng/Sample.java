package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void openapp() {
		Reporter.log("BS",true);
	}
@AfterSuite
public void closeapp()
{
	Reporter.log("AS",true);
}

@BeforeClass
public void openbrowser()
{
	Reporter.log("BC",true);
}
@AfterClass
public void closebrowsre()
{
	Reporter.log("AC",true);
}
@BeforeTest
public void abc()
{
	Reporter.log("BT",true);
}
@AfterTest
public void xyz()
{
	Reporter.log("AT",true);
	
}
@BeforeMethod
public void bjsfdj()
{

	Reporter.log("BM",true);
}
@AfterMethod
public void bv()
{
	Reporter.log("AM",true);
}
@Test
public void xc()
{
	Reporter.log("Test",true);
}
}
