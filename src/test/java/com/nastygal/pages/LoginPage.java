package com.nastygal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(name = "dwfrm_login_register")
    public WebElement CreateAccount;

    public CreateAccountPage clickOnCreateAccount()
    {
        CreateAccount.click();

        return new CreateAccountPage(driver);

    }

    @FindBy(name = "dwfrm_login_username_d0uukftymxzo")
    public WebElement userEmailAddress;


    public void enteruserEmailAddress(String emailAddress)
    {
        userEmailAddress.clear();
        userEmailAddress.sendKeys();
    }

    @FindBy(name="dwfrm_login_password_d0bsqjzynfna")
    public WebElement loginPassword;

    public void enterloginPassword(String password)
    {
        loginPassword.clear();
        loginPassword.sendKeys();
    }



}
