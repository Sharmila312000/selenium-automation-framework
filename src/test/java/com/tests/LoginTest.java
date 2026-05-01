package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;
import com.listeners.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseClass {

	@Test(retryAnalyzer = com.utils.RetryAnalyzer.class)
    public void verifyLogin() {

        // Step 1: Create Login Page object (THREAD SAFE)
        LoginPage loginPage = new LoginPage(getDriver());

        // Step 2: Perform login
        loginPage.login("standard_user", "secret_sauce");

        // Step 3: Validation
        String currentUrl = getDriver().getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("inventory"),
                "Login Failed - Inventory page not opened");

        System.out.println("Login Successful");
    }
}