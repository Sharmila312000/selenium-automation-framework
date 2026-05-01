package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Add to cart button (first product)
    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");

    // Cart icon
    By cartIcon = By.className("shopping_cart_link");

    // Actions

    public void addProductToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}