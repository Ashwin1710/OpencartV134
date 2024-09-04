package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLoginPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("****Starting TC002_LoginTest****");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		AccountLoginPage lp=new AccountLoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage= macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true,"Login Failed");
		//Assert.assertTrue(targetpage);
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("****Finished TC002_LoginTest****");
		
	}
	
	
	

}
