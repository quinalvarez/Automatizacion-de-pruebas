package com.depp3.steps.pages.ventas.productos;

import com.depp3.steps.generals.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.time.Duration;

public class ProductTest extends BaseTest {

    @When("^Ingresar al modulo productos$")
    public void articleModule() {
        try {
            homePage.clickSaleModule();
            productPage.clickProductsModule();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @And("^Presionamos boton agregar producto$")
    public void pressAddArticleButtom() {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2L));
            productPage.clickBtnAddProduct();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
