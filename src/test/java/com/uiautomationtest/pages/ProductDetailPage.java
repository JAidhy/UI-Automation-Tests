package com.uiautomationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author JaspreetAidhy
 *
 */
public class ProductDetailPage extends BasePage {

    public ProductDetailPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#add_to_cart > button")
    WebElement addToCart;

    @FindBy(tagName = "h2")
    List<WebElement> messageHeadings;
    
    // To click on 'Add to cart' button on product detail page
    public void clickOnAddToCart() throws InterruptedException {
    	
    	/*There is an inconsistency in the application. 
    	When user clicks on product sometimes iframe is displayed and sometimes the iframe is not displayed.*/
    	
//        driver.switchTo().defaultContent();
//        driver.switchTo()
//                .frame(0);
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(addToCart));
        addToCart.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
    }
    
    //To verify product is successfully added to the cart and success message is displayed 
    public boolean validateProductAddedToCart() {

        return messageHeadings.stream()
                .filter(e -> e.getText().trim().equalsIgnoreCase("Product successfully added to your shopping cart"))
                .findFirst()
                .get()
                .isDisplayed();
    }

}



