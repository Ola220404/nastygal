package com.nastygal.pages;

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
}

