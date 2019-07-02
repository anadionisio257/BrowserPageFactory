package genericmethods;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
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

}
