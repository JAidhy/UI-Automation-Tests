package com.uiautomationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author JaspreetAidhy
 *
 */
public class WelcomePage extends BasePage {
    public WelcomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "logout")
    WebElement signout;

    @FindBy(className = "account")
    WebElement accountName;
    
    //To verify user has signed out 
    public boolean validateSignOutIsDisplayed() {
        return signout.isDisplayed();
    }
    
    //To read the customer name after successful login
    public String getCustomerName() {
        return accountName.getText();
    }

}
