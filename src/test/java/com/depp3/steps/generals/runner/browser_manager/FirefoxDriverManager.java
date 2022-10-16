package com.depp3.steps.generals.runner.browser_manager;

import com.depp3.steps.generals.ConfigProperties;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        System.setProperty("webdriver.gecko.driver", ConfigProperties.getProp("driver.firefox.path"));
        driver = new FirefoxDriver();
    }
}
