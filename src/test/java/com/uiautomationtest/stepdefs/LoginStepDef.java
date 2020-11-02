/**
 *
 */
package com.uiautomationtest.stepdefs;

import com.uiautomationtest.pages.SignInPage;
import com.uiautomationtest.pages.WelcomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author JaspreetAidhy
 *
 */
public class LoginStepDef extends BaseStepDef {

	private BaseStepDef baseStepDef;

	public LoginStepDef(BaseStepDef baseStepDef) {
		this.baseStepDef = baseStepDef;
	}

    @When("I enter {string} and {string} which are not registered")
    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String password) {
        baseStepDef.signInPage  =  new SignInPage();
        baseStepDef.signInPage.enterLoginCredentials(username,password);
    }

    @Then("I should be able to successfully login")
    public void i_should_be_able_to_successfully_login() {
		WelcomePage welcomePage = new WelcomePage();
		welcomePage.validateSignOutIsDisplayed();
    }

    @Then("I should not be able to login")
    public void i_should_not_be_able_to_login() {
        assertThat(baseStepDef.signInPage.authenticationFailureMsgDisplayed()).isTrue();
    }

}
