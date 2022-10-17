package com.depp3.steps.generals.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By element) throws Exception{
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se pudo clickear sobre el elemento: " + element);
        }
    }

    protected Boolean isDisplayed(By element) throws Exception{
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }

    protected String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }

    protected String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el titulo del driver: ");
        }
    }

    protected void waitSeconds(Long seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    protected void sendKeys(By element, String text) throws Exception{
        try {
            driver.findElement(element).sendKeys(text);
        } catch (Exception e) {
            throw new Exception("No se pudo escribir en el elemento: " + element);
        }
    }
}
