package com.depp3.steps.Utils.articulos;

import com.depp3.steps.generals.hooks.Hook;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Articulo {

    private final WebDriver driver = Hook.getDriver();

    @When("Ingresar al modulo productos")
    public void articleModule() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2L));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2L));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]")).click();
    }

    @When("Presionamos boton agregar producto")
    public void pressAddArticleButtom() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2L));
        driver.findElement(By.xpath("//*[@id=\"buttonBarAcciones\"]/div[3]/button")).click();
    }
}
