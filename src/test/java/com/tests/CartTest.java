package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.listeners.TestListener;

@Listeners(TestListener.class)
public class CartTest extends BaseClass {

    @Test(groups = {"Regression"})
    public void verifyAddToCart() {

        // Login
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");

        // Add product
        ProductPage productPage = new ProductPage(getDriver());
        productPage.addProductToCart();

        // Go to cart
        productPage.goToCart();

        // Validation
        Assert.assertTrue(
                getDriver().getCurrentUrl().contains("cart"),
                "Cart page not opened"
        );

        System.out.println("Cart Test Passed");
    }
}