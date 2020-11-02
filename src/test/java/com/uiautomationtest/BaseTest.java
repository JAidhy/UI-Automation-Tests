package com.uiautomationtest;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//Singleton pattern is used to create single instance of this class
public class BaseTest {

    private static BaseTest baseTest = null;
    private WebDriver driver;

    private BaseTest() {
        WebDriverManager.chromedriver().setup();
        ChromeDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static BaseTest getBaseClassInstance() {
        if (baseTest == null) {
            baseTest = new BaseTest();
        }
        return baseTest;
    }

    // To get the driver
    public WebDriver getDriver() {
        return driver;
    }
    
    //To set the instance as null
    public void setBaseTestInstance() {
       baseTest = null;
    }


}
