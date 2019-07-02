package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id='bootstrap-overrides']/app-root/div[2]/app-header/oss-menu-view/div[2]/a[4]")
	WebElement myWorkTab;
	
    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Get the User name from Home Page

        public void homePageValidation(){

        	Assert.assertEquals("MY_WORK", myWorkTab.getText());
        }


}
