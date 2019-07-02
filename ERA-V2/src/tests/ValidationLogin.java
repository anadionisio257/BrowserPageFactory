package tests;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LoginPage;

public class ValidationLogin {

    WebDriver driver;

    @Before

    public void setup(){

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://oss-sat.test-era.europa.eu/logon.html");

    }

    
	@Test

    public void testLoginOK(){

    //Create Login Page object

	LoginPage loginpage = new LoginPage(driver);
	HomePage homepage = new HomePage(driver);

	loginpage.insertUser("e.ralogin@gmail.com");
	loginpage.insertPassword("Passw0rd!2018");
    loginpage.clickLoginButton();
    homepage.homePageValidation();
    

    }
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}