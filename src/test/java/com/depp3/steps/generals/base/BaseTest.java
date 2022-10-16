package com.depp3.steps.generals.base;

import com.depp3.steps.generals.hooks.Hook;
import com.depp3.steps.pages.home.HomePage;
import com.depp3.steps.pages.ventas.productos.ProductPage;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected final WebDriver driver = Hook.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected ProductPage productPage = new ProductPage(driver);
}
