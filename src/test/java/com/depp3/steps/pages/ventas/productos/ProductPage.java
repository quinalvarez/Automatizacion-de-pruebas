package com.depp3.steps.pages.ventas.productos;

import com.depp3.steps.generals.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    private final static String PRODUCTS ="/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]";
    private final static String BTN_ADD_PRODUCT = "//*[@id=\"buttonBarAcciones\"]/div[3]/button";
    private final By products = By.xpath(PRODUCTS);
    private final By btnAddProduct = By.xpath(BTN_ADD_PRODUCT);

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductsModule() throws Exception {
        try {
            click(products);
            waitSeconds(1L);
        } catch (Exception e) {
            throw new Exception("No se localizo el modulo de productos: " + products);
        }
    }

    public void clickBtnAddProduct() throws Exception {
        try {
            click(btnAddProduct);
            waitSeconds(1L);
        } catch (Exception e) {
            throw new Exception("No se localizo el boton para agregar productos: " + btnAddProduct);
        }
    }
}
