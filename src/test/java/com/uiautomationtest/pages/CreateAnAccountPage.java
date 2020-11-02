package com.uiautomationtest.pages;

import com.uiautomationtest.util.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author JaspreetAidhy
 *
 */

public class CreateAnAccountPage extends BasePage {
    public CreateAnAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "customer_firstname")
    WebElement customerFirstname;

    @FindBy(id = "customer_lastname")
    WebElement customerLastname;

    @FindBy(id = "passwd")
    WebElement customerPassword;

    @FindBy(id = "days")
    WebElement dobDay;

    @FindBy(id = "months")
    WebElement dobMonth;

    @FindBy(id = "years")
    WebElement dobYear;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement state;

    @FindBy(id = "postcode")
    WebElement postcode;

    @FindBy(id = "id_country")
    WebElement country;

    @FindBy(id = "phone_mobile")
    WebElement phoneMobile;

    @FindBy(id = "alias")
    WebElement alias;

    @FindBy(id = "submitAccount")
    WebElement registerButton;

    public String EnterPersonalDetail() {
        String firstName = Util.generateRandomFirstName();
        String lastName = Util.generateRandomLastName();
        addPersonalInfo(customerFirstname, firstName);
        addPersonalInfo(customerLastname, lastName);
        addPersonalInfo(customerPassword, "Pass123");
        selectFromDropDown(dobDay, "1");

        selectFromDropDown(dobMonth, "1");

        selectFromDropDown(dobYear, "1980");

        addPersonalInfo(address1, Util.generateRandomAddress());

        addPersonalInfo(city, Util.generateRandomCityName());

        selectFromDropDown(state, "1");

        addPersonalInfo(postcode, Util.generateRandomPostCode());

        selectFromDropDown(country, "21");

        addPersonalInfo(phoneMobile, Util.generateRandomMobileNo());

        return firstName + " " + lastName;
    }

    private void addPersonalInfo(WebElement element, String s) {
        element.sendKeys(s);
    }

    private void selectFromDropDown(WebElement element, String s) {
        Select selElement = new Select(element);
        selElement.selectByValue(s);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

}
