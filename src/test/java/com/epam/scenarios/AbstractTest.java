package com.epam.scenarios;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractTest {

    private WebDriver driver;

    @BeforeAll
    public static void precondition (){
        System.out.println("Setup driver property");
        System.setProperty("webdriver.chrome.driver","/Users/Ravil_Yanbekov/Documents/chromedriver");
    }

    public WebDriver getDriver() {
        if (driver == null) {
            return new ChromeDriver();
        }
        return driver;
    }
}
