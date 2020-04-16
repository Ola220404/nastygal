package com.nastygal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends BasePage {

     public CreateAccountPage(WebDriver driver){
         this.driver = driver;
         PageFactory.initElements(driver, this);
     }
     @FindBy(name = "dwfrm_profile_customer_firstname")
     private WebElement firstNameField;
     @FindBy(name = "dwfrm_profile_customer_lastname")
     private WebElement lastNameField;
     @FindBy(name = "dwfrm_profile_customer_dayofbirth")
     private WebElement dayOfBirthField;
     @FindBy(name = "dwfrm_profile_customer_monthofbirth")
     private WebElement monthOfBirthField;
     @FindBy(name = "dwfrm_profile_customer_yearofbirth")
     private WebElement yearOfBirthField;
     @FindBy(name = "dwfrm_profile_customer_gender")
     private WebElement customerGender;
     @FindBy(id = "dwfrm_profile_customer_email")
     private WebElement customerEmail;
     @FindBy(id = "dwfrm_profile_customer_emailconfirm")
     private WebElement customerEmailConfirm;
     @FindBy(css = "input[id*='dwfrm_profile_login_password_']")
     private WebElement passwordField;
     @FindBy(css = "input[id*='dwfrm_profile_login_passwordconfirm_']")
     private WebElement passwordConfirmField;
     @FindBy(name = "dwfrm_profile_confirm")
     private WebElement registerButton;


     public void enterFirstName(String firstName)
     {
      firstNameField.clear();
      firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName)
    {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }
    public void enterDayOfBirth(String dayOfBirth)
    {
        dayOfBirthField.clear();
        dayOfBirthField.sendKeys(dayOfBirth);
    }
    public void enterMonthOfBirth(String monthOfBirth)
    {
        monthOfBirthField.clear();
        monthOfBirthField.sendKeys(monthOfBirth);
    }
    public void enterYearOfBirth(String yearOfBirth)
    {
        yearOfBirthField.clear();
        yearOfBirthField.sendKeys(yearOfBirth);
    }
    public void setCustomerGender(String gender)
    {
        selectElementByVisibleText(customerGender,gender);
    }
    public void enterCustomerEmail(String email)
    {
        customerEmail.clear();
        customerEmail.sendKeys(email);
    }
    public void enterCustomerEmailConfirm(String emailConfirm)
    {
        customerEmailConfirm.clear();
        customerEmailConfirm.sendKeys(emailConfirm);
    }
    public void enterPassword(String password)
    {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void enterPasswordConfirm(String passwordConfirm)
    {
        passwordConfirmField.clear();
        passwordConfirmField.sendKeys(passwordConfirm);
    }

    public ContentPage clickOnRegisterButton()
    {
        registerButton.click();
        return new ContentPage(driver);

    }


}

