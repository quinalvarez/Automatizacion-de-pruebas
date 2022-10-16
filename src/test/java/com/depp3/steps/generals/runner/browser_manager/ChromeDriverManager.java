package com.depp3.steps.generals.runner.browser_manager;

import com.depp3.steps.generals.utils.ConfigProperties;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        System.setProperty("webdriver.chrome.driver", ConfigProperties.getProp("driver.chrome.path"));
        driver = new ChromeDriver();
    }
}
