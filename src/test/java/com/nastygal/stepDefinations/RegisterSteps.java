package com.nastygal.stepDefinations;

import com.nastygal.pages.*;
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
    ContentPage contentPage = PageFactory.initElements(driver, ContentPage.class);


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
       createAccountPage = loginPage.clickOnCreateAccount();
    }

    @And("I enter {string} in the first name field")
    public void iEnterInTheFirstNameField(String firstName) {
        createAccountPage.enterFirstName(firstName);

    }
    @And("I enter {string} in the last name field")
    public void iEnterInTheLastNameField(String lastName) {
        createAccountPage.enterLastName(lastName);
    }
    @And("I enter {string} in the birth day field")
    public void iEnterInTheBirthDayField(String dateOfBirth) {
        createAccountPage.enterDayOfBirth(dateOfBirth);

    }
    @And("I enter {string} in the birth month field")
    public void iEnterInTheBirthMonthField(String birthMonth) {
        createAccountPage.enterMonthOfBirth(birthMonth);
    }
    @And("I enter {string} in the birth year field")
    public void iEnterInTheBirthYearField(String yearOfBirth) {
        createAccountPage.enterYearOfBirth(yearOfBirth);
    }

    @And("I select {string} from the gender drop down")
    public void iSelectFromTheGenderDropDown(String gender) {
         createAccountPage.setCustomerGender(gender);
    }

    @And("I enter {string} in the email address field")
    public void iEnterInTheEmailAddressField(String email) {
        createAccountPage.enterCustomerEmail(email);
    }

    @And("I enter {string} in the confirm email address field")
    public void iEnterInTheConfirmEmailAddressField(String emailConfirm) {
        createAccountPage.enterCustomerEmailConfirm(emailConfirm);
    }

    @And("I enter {string} in the password field")
    public void iEnterInThePasswordField(String password) {
        createAccountPage.enterPassword(password);
    }

    @And("I enter {string} in the confirm password field")
    public void iEnterInTheConfirmPasswordField(String confirmPassword) {
        createAccountPage.enterPasswordConfirm(confirmPassword);
    }
    @And("I click on REGISTER button")
    public void iClickOnRegisterButton() {
        contentPage = createAccountPage.clickOnRegisterButton();

    }

    @Then("I am taken to nastygal contentpage")
    public void iAmTakenToNastyGalContentpage() {
    }

    @Then("I get an error message or a prompt for the missing field")
    public void iGetAnErrorMessageOrAPromptForTheMissingField() {
    }

}

