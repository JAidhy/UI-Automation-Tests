package com.uiautomationtest.stepdefs;

import com.uiautomationtest.pages.HomePage;
import com.uiautomationtest.pages.ProductDetailPage;
import com.uiautomationtest.pages.SummerDressesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.*;

/**
 * @author JaspreetAidhy
 *
 */

public class PlaceOrderStepDef extends BaseStepDef {

    private BaseStepDef baseStepDef;

    public PlaceOrderStepDef(BaseStepDef baseStepDef) {
        this.baseStepDef = baseStepDef;
    }

    @When("I navigate to Summer Dresses")
    public void iNavigateToSummerDresses() {
        baseStepDef.homePage = new HomePage();
        baseStepDef.homePage.clickOnSummerDresses();

    }

    @And("I select an item from Summer Dresses list")
    public void iSelectAnItemSummerDressesList() throws InterruptedException {

        SummerDressesPage summerDressesPage = new SummerDressesPage();
        summerDressesPage.selectSummerDress();
    }

    @And("I add the item to the cart")
    public void iAddTheItemToTheCart() throws InterruptedException {
        baseStepDef.productDetailPage = new ProductDetailPage();
        baseStepDef.productDetailPage.clickOnAddToCart();
    }

    @Then("the item should be successfully added to the cart")
    public void theItemShouldBeSuccessfullyAddedToTheCart() {
        assertThat(baseStepDef.productDetailPage.validateProductAddedToCart()).isTrue();
    }


}
