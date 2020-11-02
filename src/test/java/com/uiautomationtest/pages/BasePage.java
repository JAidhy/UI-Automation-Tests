package com.uiautomationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.uiautomationtest.BaseTest;
import com.uiautomationtest.util.PropertiesUtil;

/**
 * @author JaspreetAidhy
 *
 */

public class BasePage {
    public WebDriver driver = BaseTest.getBaseClassInstance().getDriver();


    public HomePage navigateToWebsite() {
        final PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();
        driver.navigate().to(propertiesUtil.getWebURL());
        return PageFactory.initElements(driver, HomePage.class);
    }

}
