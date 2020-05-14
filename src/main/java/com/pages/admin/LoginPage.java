package com.pages.admin;

import org.openqa.selenium.By;
import utils.PageBase;
import java.util.logging.Logger;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
    private static By TxtUsername= By.id("txtUsername");
    private static By TxtPassworld= By.id("txtPassword");
    private static By btnLogin= By.id("btnLogin");
    private static By HrmHeader =By.id("logInPanelHeading");
    private static By clickwelcom =By.id("welcome");
    private static By logout =By.xpath("//a[@href=\"/index.php/auth/logout\"]");



    public static void waittime(){
        waiTillClickable(logout,3);
    }
    public static boolean isHrmLoginPageDisplayed() {
        return getDriver().findElement(HrmHeader).isDisplayed();

    }
    public static void setUserName(String username) {
        getDriver().findElement(TxtUsername).sendKeys(username);
        LOGGER.info("Entered Username");


    }

    public static void setPass(String pass) {
        getDriver().findElement(TxtPassworld).sendKeys(pass);
        LOGGER.info("Entered Pass");

    }
    public static void ClickLogin() {
        getDriver().findElement(btnLogin).click();
        LOGGER.info("Click Login");

    }
    public static void ClickLogout() {
        getDriver().findElement(logout).click();
        LOGGER.info("Clicked Logout");

    }
    public static void Clickwelcom() {
        getDriver().findElement(clickwelcom).click();
        LOGGER.info("Clicked Welcome");

    }
}


