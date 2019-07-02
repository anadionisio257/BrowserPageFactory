package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

    @FindBy(id="email")
    WebElement user;

    @FindBy(id="password")
    WebElement password;    

    @FindBy(id="input_login_button")
    WebElement loginbutton;
    
    public LoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


    //Set user name in textbox

    public void insertUser(String username){

    	user.sendKeys(username);

    }

    //Set password in password textbox

    public void insertPassword(String pass){

    	password.sendKeys(pass);

    }

    //Click on login button

    public void clickLoginButton(){

    	loginbutton.click();

    }

}