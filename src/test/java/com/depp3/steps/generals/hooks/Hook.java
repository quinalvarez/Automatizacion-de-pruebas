package com.depp3.steps.generals.hooks;

import com.depp3.steps.generals.ConfigProperties;
import com.depp3.steps.generals.runner.browser_manager.DriverManager;
import com.depp3.steps.generals.runner.browser_manager.DriverManagerFactory;
import com.depp3.steps.generals.runner.browser_manager.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hook {

    private final static String USERNAME = "username";
    private final static String PASSWORD = "password";
    private final static String URL = "URL";
    private final static String DATA = "data.";
    private static WebDriver driver;
    private static DriverManager driverManager;

    @Before()
    public void setUp() {
        driverManager = DriverManagerFactory.create(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(ConfigProperties.getProp("URL"));
        driver.manage().window().maximize();
        login();
        closePopUps();
    }

    @After()
    public void tearDown() {
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Logueo en la pagina con user y pass,
     * con una espera de 8 seg.
     */
    private void login() {
        driver.findElement(By.id(USERNAME)).sendKeys(ConfigProperties.getProp(DATA + USERNAME));
        driver.findElement(By.id(PASSWORD)).sendKeys(ConfigProperties.getProp(DATA + PASSWORD));
        driver.findElement(By.id("submit")).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8L));
    }

    private void closePopUps() {
        driver.findElement(By.xpath("//*[@id=\"ZeusGestionWebzeus-655465539-overlays\"]/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"UiHandler_validateConcurrence_ZFormWindow_btnCancelar\"]")).click();
    }
}
