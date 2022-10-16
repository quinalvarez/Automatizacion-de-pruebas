package com.depp3.steps.generals.runner.browser_manager;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void createDriver();

    /**
     * Cerramos y seteamos el driver en null
     */
    public void quitDriver(){
        if(Objects.nonNull(driver)) {
            driver.quit();
            driver = null;
        }
    }

    /**
     * En caso de que atributo driver sea null creamos la instancia
     * del driver correspondiente.
     * @return Obtenemos la instancia del driver
     */
    public WebDriver getDriver() {
        if(Objects.isNull(driver)) {
            createDriver();
        }
        return driver;
    }
}
