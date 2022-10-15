package com.depp3.steps.bug_6359;

import com.depp3.steps.generals.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PruebaActual {

    @And("Prueba actual")
    public void testActual() {
        WebDriver driver = Driver.getInstance();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div")).click();
    }
}
