package com.uiautomationtest.stepdefs;

import com.uiautomationtest.pages.CreateAnAccountPage;
import com.uiautomationtest.pages.SignInPage;
import com.uiautomationtest.pages.WelcomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;

/**
 * @author JaspreetAidhy
 *
 */

public class RegisterationStepDef extends BaseStepDef {

    private BaseStepDef baseStepDef;

    public RegisterationStepDef(BaseStepDef baseStepDef) {
        this.baseStepDef = baseStepDef;
    }

    @When("I enter valid email address to create an account")
    public void i_enter_valid_email_address_to_create_an_account() {
        SignInPage signInPage = new SignInPage();
        signInPage.EnterEmailId();
        signInPage.clickCreateAccountButton();
    }

    @When("I enter valid personal information")
    public void i_enter_valid_personal_information() {
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
        baseStepDef.fullName = createAnAccountPage.EnterPersonalDetail();
        createAnAccountPage.clickRegisterButton();
    }

    @Then("I should be able successfully register")
    public void i_should_be_able_successfully_register() {
        WelcomePage welcomePage = new WelcomePage();
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(welcomePage.validateSignOutIsDisplayed()).isTrue();
            softly.assertThat(welcomePage.getCustomerName().equals(baseStepDef.fullName));
        });
    }
}
