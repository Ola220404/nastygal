package com.nastygal.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
     @FindBy(css = ".user-link-item.link-item-login")
     public WebElement myAccount;

    public LoginPage clickOnMyAccount()
    {
        myAccount.click();
        return new LoginPage(driver);
    }



}
