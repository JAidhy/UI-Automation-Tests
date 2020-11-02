package com.uiautomationtest.pages;

import com.uiautomationtest.util.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author JaspreetAidhy
 *
 */
public class SignInPage extends BasePage {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email_create")
    WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    WebElement submitCreate;

    @FindBy(id="email")
    WebElement emailAddress;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="SubmitLogin")
    WebElement signIn_button;

    @FindBy(xpath=".//li[contains(text(),'Authentication failed.')]")
    WebElement authentication_failure;
    
    // To enter credentials to the login screen
    public void enterLoginCredentials(String Username, String Password ) {

        emailAddress.sendKeys(Username);
        password.sendKeys(Password);
        signIn_button.click();
    }
    
    //To enter email address in registration scenario
    public void EnterEmailId() {
        emailCreate.sendKeys(Util.generateRandomEmail());
    }
    
    //To click on Create account button
    public void clickCreateAccountButton() {
        submitCreate.click();
    }
    
    //To verify the error message when an unregistered user tries to login
    public boolean authenticationFailureMsgDisplayed(){
        return  authentication_failure.isDisplayed();
    }
}
