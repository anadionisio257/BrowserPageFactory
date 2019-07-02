package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public WebElement sign_in_button;

	public HomePage(WebDriver driver) {

		// This initElements method will create all WebElements
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to click on Sign In button
	public void clickSignIn() {
		sign_in_button.click();
	}

}
