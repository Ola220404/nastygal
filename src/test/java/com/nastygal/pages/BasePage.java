package com.nastygal.pages;

import com.nastygal.common.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLib
{
    public String BASE_URL = "https://www.nastygal.com/";
    public Select select;


    public void launchUrl()
    {
        driver.navigate().to(BASE_URL);
    }

    public void waitForElementToBeClick(WebElement element)
    {
        wait= new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void selectElementByVisibleText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectElementByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
}

