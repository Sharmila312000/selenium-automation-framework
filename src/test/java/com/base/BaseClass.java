package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver.set(new ChromeDriver());

        getDriver().manage().window().maximize();
        getDriver().get("https://www.saucedemo.com");
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterClass
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }
}