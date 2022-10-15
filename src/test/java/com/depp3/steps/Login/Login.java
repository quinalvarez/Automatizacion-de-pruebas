package com.depp3.steps.Login;

import com.depp3.steps.generals.ConfigProperties;
import com.depp3.steps.generals.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login {

    private WebDriver driver;

    @Given("Que el login este disponible")
    public void ingresoUrl() {
        driver = Driver.getInstance();
        driver.navigate().to(ConfigProperties.getProp("URL"));
    }

    @When("Completo usuario y password")
    public void completarDatos() {
        driver.findElement(By.id("username")).sendKeys(ConfigProperties.getProp("data.username"));
        driver.findElement(By.id("password")).sendKeys(ConfigProperties.getProp("data.password"));
    }

    @And("Click iniciar sesion")
    public void clickIniciarSesion() {
        // iniciar session id=submit
        driver.findElement(By.id("submit")).submit();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("Cerrar ventanas sin cerrar demas sesiones")
    public void cerrarVentanas() {
        driver.findElement(By.xpath("//*[@id=\"ZeusGestionWebzeus-655465539-overlays\"]/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"UiHandler_validateConcurrence_ZFormWindow_btnCancelar\"]")).click();
    }
}
