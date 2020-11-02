package com.uiautomationtest.stepdefs;

import com.uiautomationtest.BaseTest;
import com.uiautomationtest.pages.BasePage;
import com.uiautomationtest.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
/**
 * @author JaspreetAidhy
 *
 */
public class CommonSteps extends BaseStepDef{

    HomePage homePage;

    @Given("I navigate to the shopping website")
    public void i_navigate_to_the_shopping_website() {
        homePage = new BasePage().navigateToWebsite();
    }

    @When("I navigate to Signin page")
    @When("I select sign in to register as a new user")
    public void i_select_sign_in_to_register_as_a_new_user() {
        new HomePage().clickOnSignInLink();
    }

    @After
    public void afterScenario() {
        BaseTest.getBaseClassInstance().getDriver().close();
        BaseTest.getBaseClassInstance().getDriver().quit();
        BaseTest.getBaseClassInstance().setBaseTestInstance();

    }
}
