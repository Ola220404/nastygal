package com.nastygal.stepDefinations;

import com.nastygal.pages.BasePage;
import com.nastygal.pages.CreateAccountPage;
import com.nastygal.pages.HomePage;
import com.nastygal.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class RegisterSteps extends BasePage
{

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);


    @Given("I navigate to nastygal homepage")
    public void i_navigate_to_nastygal_homepage() {
        launchUrl();

    }
    @When("I click on My Account")
    public void iClickOnMyAccount() {
        loginPage = homePage.clickOnMyAccount();

    }
    @And("I click on CREATE ACCOUNT button")
    public void iClickOnCreateAccount() {
        loginPage.clickOnCreateAccount();
    }

    @And("I enter {string} in the first name field")
    public void iEnterInTheFirstNameField(String firstName) {
        createAccountPage.enterFirstName(firstName);

    }
    @And("I enter {string} in the last name field")
    public void iEnterInTheLastNameField(String lastName) {
        createAccountPage.enterLastName(lastName);

    }

    @And("I enter {string} in the tittle field")
    public void iEnterInTheTittleField(String sex) {
    }

    @And("I enter {string} in the date of birth field")
    public void iEnterInTheDateOfBirthField(String arg0) {
    }

    @And("I select {string} from the gender dropdown")
    public void iSelectFromTheGenderDropdown(String arg0) {
    }

    @And("I enter {string} in the email address field")
    public void iEnterInTheEmailAddressField(String arg0) {
    }

    @And("I enter {string} in the confirm email address field")
    public void iEnterInTheConfirmEmailAddressField(String arg0) {
    }

    @And("I enter {string} in the password field")
    public void iEnterInThePasswordField(String arg0) {
    }

    @And("I enter {string} in the confirm password field")
    public void iEnterInTheConfirmPasswordField(String arg0) {
    }

    @And("I click on REGISTER button")
    public void iClickOnRegisterButton() {
    }

    @Then("I am taken to nastygal homepage")
    public void iAmTakenToNastyGalHomepage() {
    }

    @Then("I get an error message or a prompt for the missing field")
    public void iGetAnErrorMessageOrAPromptForTheMissingField() {
    }


}
