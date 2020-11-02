package com.uiautomationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author JaspreetAidhy
 *
 */
public class SummerDressesPage extends BasePage {

    public SummerDressesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".product_img_link")
    List<WebElement> summerDresses;


    @FindBy(xpath = ".//span[contains[text(),'Add to cart')]")
    WebElement addToCartButton;
    
    //To select the first summer dress from the Summer dress page
    public void selectSummerDress() {

        summerDresses.stream()
                .findFirst()
                .get()
                .click();
    }
}



