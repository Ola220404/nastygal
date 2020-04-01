package com.nastygal.stepDefinations;

import com.nastygal.pages.BasePage;
import com.nastygal.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class RegisterSteps extends BasePage
{

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @Given("I navigate to nastygal homepage")
    public void i_navigate_to_nastygal_homepage() {
        launchUrl();

    }

    @When("I click on My Account")
    public void iClickOnMyAccount() {
     homePage.clickOnMyAccount();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("I click on Create Account")
    public void iClickOnCreateAccount() {
    }

    @And("I enter {string} in the tittle field")
    public void iEnterInTheTittleField(String sex) {
    }

    @And("I enter {string} in the first name field")
    public void iEnterInTheFirstNameField(String arg0) {
    }

    @And("I enter {string} in the last name field")
    public void iEnterInTheLastNameField(String arg0) {
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

    @And("I click on {string}")
    public void iClickOn(String arg0) {
    }

    @Then("I am taken to {string} homepage")
    public void iAmTakenToHomepage(String arg0) {
    }

    @Then("I get an error message or a prompt for the missing field")
    public void iGetAnErrorMessageOrAPromptForTheMissingField() {
    }


}
