package com.depp3.steps.generals.hooks;

import com.depp3.steps.generals.utils.ConfigProperties;
import com.depp3.steps.generals.runner.browser_manager.DriverManager;
import com.depp3.steps.generals.runner.browser_manager.DriverManagerFactory;
import com.depp3.steps.generals.runner.browser_manager.DriverType;
import com.depp3.steps.pages.login.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hook {

    private final static String URL = "URL";
    private static WebDriver driver;
    private static DriverManager driverManager;

    @Before()
    public void setUp() {
        driverManager = DriverManagerFactory.create(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(ConfigProperties.getProp(URL));
        driver.manage().window().maximize();
        try {
            LoginPage lp = new LoginPage(driver);
            lp.login();
            lp.closeFirstPopUps();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @After()
    public void tearDown() {
        if (ConfigProperties.getProp("close.page").equals("true")) {
            driverManager.quitDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
