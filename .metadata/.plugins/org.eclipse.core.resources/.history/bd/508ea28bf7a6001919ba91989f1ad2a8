package genericmethods;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import loginTUC008.String;

public class BaseMethods {

	public static WebDriver driver;

	public static void openURL(String url) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Assert.assertEquals("My Store", driver.getTitle());

	}
	
	// Method to scroll in the page
	public static void scrollPage(By element) throws Exception {
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("arguments[0].scrollIntoView();", driver.findElement(element));
	}

	// Method to hover the mouse in element to show invisible items
	public static void mouseOver(By element) throws Exception {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(element)).perform();
	}

	// Method to take screenshots
	public void takeScreenshot(String testname, int testid, String path) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(path + testname + testid + "-" + timestamp() + ".jpeg"));
	}
	
	// Method to set timestamp
	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH.mm.ss").format(new Date());
	}
	
	//Method to close browser
	public void quitBrowser() throws Exception {
		driver.quit();	
	}
	
	/* Aqui está o ciclo for para voces usarem:
	 * 	public String[] users = { "e.ralogin@gmail.com", "l.xeralogin@gmail.com", "eralogi.n@gmail.com",
			"lxeralogin@gmail.com", "lx.eralogin@gmail.com" }; -> Isto declaram no BaseMethods
		
		//A partir daqui declaram em cada teste:
		 * LinkedList<String> userList = new LinkedList<>();
		 * 
		 * for (int i = 0; i < users.length; i++) {

			userList.add(users[i]);

			public static void doLogin(String user, String pass) throws Exception {

				driver.findElement(By.xpath(accessOR("email"))).click();
				driver.findElement(By.xpath(accessOR("email"))).clear();
				driver.findElement(By.xpath(accessOR("email"))).sendKeys(user);
				driver.findElement(By.xpath(accessOR("pass"))).click();
				driver.findElement(By.xpath(accessOR("pass"))).clear();
				driver.findElement(By.xpath(accessOR("pass"))).sendKeys(pass);

				// takeScreenshot(testname, num++, path);

				driver.findElement(By.xpath(accessOR("btn_login"))).click();

				threadWait(3000);

		
			}

			Assert.assertEquals("My Work", driver.findElement(By.xpath(accessOR("my_work"))).getText());

			public static void doLogout() throws Exception {

				driver.findElement(By.xpath(accessOR("user"))).click();
				driver.findElement(By.xpath(accessOR("btn_logout"))).click();
		
			}
		}
		
	 */

}
