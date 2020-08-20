package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibs.ExcelLibrary;
import pages.LoginPage;

public class TC002 extends BaseTest{
	@Test
	public void InvalidLogin() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		String username = ExcelLibrary.getValue(XL_PATH, "TC002", 1, 0);
		String password = ExcelLibrary.getValue(XL_PATH, "TC002", 1, 1);
		l.setUsername(username);
		l.setPassword(password);
		l.clickLogin();
		Assert.assertTrue(l.verifyErrorMeassge());
	}
}
