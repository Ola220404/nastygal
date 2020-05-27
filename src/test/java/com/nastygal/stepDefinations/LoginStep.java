package com.nastygal.stepDefinations;

import com.nastygal.pages.BasePage;
import com.nastygal.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class LoginStep extends BasePage
{
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @And("I enter {string} in log in email address field")
    public void iEnteEmailAddressField(String emailAddress) {
        loginPage.enteruserEmailAddress(emailAddress);

    }
    @And("I enter {string} in log in password field")
    public void iEnterInLogInPasswordField(String password) {
        loginPage.enterloginPassword(password);
    }

    @When("I click on LOG IN SECURELY button")
    public void iClickOnLOGINSECURELYButton() {
    }

    @Then("I am taken to nastygal welcomepage")
    public void iAmTakenToNastygalWelcomepage() {
    }


}
