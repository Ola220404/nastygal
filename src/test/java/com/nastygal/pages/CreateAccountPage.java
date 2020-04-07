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


}

