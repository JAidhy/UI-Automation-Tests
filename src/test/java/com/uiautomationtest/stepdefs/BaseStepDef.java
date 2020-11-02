package com.uiautomationtest.stepdefs;

import com.uiautomationtest.pages.HomePage;
import com.uiautomationtest.pages.ProductDetailPage;
import com.uiautomationtest.pages.SignInPage;

/**
 * @author JaspreetAidhy
 *
 */
// This class is used for dependency Injection(To maintain state between the steps).

public class BaseStepDef {
    protected String fullName;
    protected HomePage homePage;
    protected SignInPage signInPage;
    protected ProductDetailPage productDetailPage;
}
