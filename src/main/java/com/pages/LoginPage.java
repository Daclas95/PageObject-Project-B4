package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;
import java.util.logging.Logger;

import static utils.PageBase.getDriver;

<<<<<<< HEAD

public class LoginPage {
=======
public class LoginPage extends PageBase
{
    // Login Panel
>>>>>>> c5e26ea64a2a32573a80b8b84623be299b372777
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));

    private static By TxtUsername= By.id("txtUsername");
    private static By TxtPassworld= By.id("txtPassword");
    private static By btnLogin= By.id("btnLogin");
    private static By HrmHeader =By.id("logInPanelHeading");

    // Login Panel Display Check
    private static By LoginPanel_Display=By.id("logInPanelHeading");

    public static void isLoginPanelDisplayed() throws InterruptedException
    {
        if ( getDriver().findElement(LoginPanel_Display).isDisplayed() )
        {
            LOGGER.info("LoginPanel Display Successfully");
        }

        else
        {
            LOGGER.info("LoginPanel Display Failed !!");
        }
    }

    public static void setUserName(String username) throws InterruptedException {
        getDriver().findElement(TxtUsername).sendKeys(username);
        LOGGER.info("Pass Username");
        Thread.sleep(3000);
    }

    public static void setPass(String pass) throws InterruptedException {
        getDriver().findElement(TxtPassworld).sendKeys(pass);
        LOGGER.info("Pass Password");
        Thread.sleep(3000);
    }

    public static void ClickLogin() throws InterruptedException {
        getDriver().findElement(btnLogin).click();
        LOGGER.info("Pass Login Btn");
        Thread.sleep(3000);
    }


}
