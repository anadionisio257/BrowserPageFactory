package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;

public class MyAccountPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement account_name;

	@FindBy(xpath = "//*[@id='center_column']/h1")
	WebElement my_account;

	public MyAccountPage(WebDriver driver) {

		// This initElements method will create all WebElements
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Validate entry in my account
	public void validateMyAccountEntry() {
		Assert.assertEquals("a a",account_name.getText());
		Assert.assertEquals("MY ACCOUNT",my_account.getText());
	}

}
