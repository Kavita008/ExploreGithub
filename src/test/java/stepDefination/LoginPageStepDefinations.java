package stepDefination;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.LoginPage;
import utilities.ConstantUtils;

public class LoginPageStepDefinations extends WebConnector {

LoginPage LoginPage = new LoginPage();

    @Given("the user navigate to home page")
    public void the_user_navigate_to_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }
        @When("the user enters {string} in username field")
        public void the_user_enters_in_username_field(String username) {
            LoginPage.setUsername(username);

        }
            @When("the user enters {string} in password field")
            public void the_user_enters_in_password_field(String password) {
                LoginPage.setPassword(password);
            }


    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        LoginPage.clickLogin();
    }
    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }







        }




















