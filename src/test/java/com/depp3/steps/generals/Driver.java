package com.depp3.steps.generals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    private static WebDriver instance = null;

    private Driver () {}

    public static WebDriver getInstance() {
        if (Objects.isNull(instance)) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
            instance = new ChromeDriver();
            instance.manage().window().maximize();
        }

        return instance;
    }
}
