package com.depp3.steps.pages.login;

import com.depp3.steps.generals.base.BasePage;
import com.depp3.steps.generals.utils.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final static String ID_USERNAME = "username";
    private final static String ID_PASSWORD = "password";
    private final static String ID_SUBMIT = "submit";
    private final static String COMMUNICATION_POPUP_LOCATOR = "//*[@id=\"ZeusGestionWebzeus-655465539-overlays\"]/div[5]/div/div/div[3]/div/div/div[2]/div/div/div[2]/button";
    private final static String CLOSE_SESSIONS_POPUP_LOCATOR = "//*[@id=\"UiHandler_validateConcurrence_ZFormWindow_btnCancelar\"]";
    private final By username = By.id(ID_USERNAME);
    private final By password = By.id(ID_PASSWORD);
    private final By submit = By.id(ID_SUBMIT);
    private final By commPopUp = By.xpath(COMMUNICATION_POPUP_LOCATOR);
    private final By closeSessionPopUp = By.xpath(CLOSE_SESSIONS_POPUP_LOCATOR);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() throws Exception{
        try {
            sendKeys(username, ConfigProperties.getProp(ID_USERNAME));
            sendKeys(password, ConfigProperties.getProp(ID_PASSWORD));
            click(submit);
            waitSeconds(4L);
        } catch (Exception e) {
            throw new Exception("No se pudo loguear correctamente: " + e.getMessage());
        }
    }

    public void closeFirstPopUps() throws Exception {
        try {
            click(commPopUp);
            click(closeSessionPopUp);
        } catch (Exception e) {
            throw new Exception("No se encontraron los popUps: " + e.getMessage());
        }
    }
}
