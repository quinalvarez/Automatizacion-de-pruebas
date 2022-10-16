package com.depp3.steps.pages.home;

import com.depp3.steps.generals.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final static String SALES_MODULE ="/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div";
    private final By saleModule = By.xpath(SALES_MODULE);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSaleModule() throws Exception {
        try {
            click(saleModule);
            waitSeconds(1L);
        } catch (Exception e) {
            throw new Exception("No se encontro el modulo de ventas: " + saleModule);
        }
    }
}
