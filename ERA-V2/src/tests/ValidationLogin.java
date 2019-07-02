package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import genericmethods.BaseMethods;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class ValidationLogin extends BaseMethods {

	@Before

	public void setup() throws Exception {
		openURL("http://automationpractice.com/index.php");
	}

	@Test

	public void testLoginOK() {
		
		// Create Pages object
		LoginPage loginpage = new LoginPage(driver);
		HomePage homepage = new HomePage(driver);
		MyAccountPage myaccountpage = new MyAccountPage(driver);

		homepage.clickSignIn();
		loginpage.insertUser("test.automation@sapo.pt");
		loginpage.insertPassword("testautomation");
		loginpage.clickLoginButton();
		myaccountpage.validateMyAccountEntry();

	}

	@After
	public void tearDown() throws Exception {
		quitBrowser();
	}

}