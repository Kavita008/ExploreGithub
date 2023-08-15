package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends WebConnector {
    /***************** Locators ***************/
    private String usernameFieldXpath="//input[@id='user-name']";
    private String passwordFieldXpath="//input[@id='password']";
    private String loginButtonxpath="//input[@id='login-button']";

    /******************* Getters and Setters *****************/
    /**
     * set username field
     * @param username
     */
    public void setUsername(String username)
    {BasePage.findElementByXpath(10,usernameFieldXpath).sendKeys(username);
    }

/**
 * set password field
 * @param password

 */
public void setPassword(String password) {
    BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);
}
    /**
     * click on login button
     */

    public void clickLogin(){
        BasePage.findElementByXpath(10,loginButtonxpath).click();
    }




    }







