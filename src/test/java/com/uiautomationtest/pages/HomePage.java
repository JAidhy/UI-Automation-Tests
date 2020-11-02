package com.uiautomationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author JaspreetAidhy
 *
 */
public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign in")
    WebElement signInLink;

    @FindBy(css = "ul.sf-menu li a")
    List<WebElement> menu;

    public void clickOnSignInLink() {
        signInLink.click();

    }
    //To select Summer Dresses from the menu on the home page
    public void clickOnSummerDresses() {
        Actions actions = new Actions(driver);
        menu.stream()
                .filter(webElement -> webElement.getText().equalsIgnoreCase("women"))
                .findFirst().ifPresent(webElement -> actions.moveToElement(webElement).build().perform());
        menu.stream()
                .filter(e -> e.getText().equalsIgnoreCase("Summer Dresses"))
                .findFirst()
                .ifPresent(e -> actions.moveToElement(e).click().perform());
    }

}
