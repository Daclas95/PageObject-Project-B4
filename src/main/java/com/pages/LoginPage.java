package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;


import java.util.logging.Logger;


<<<<<<< HEAD



public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
    private static By TxtUsername = By.id("txtUsername");
    private static By TxtPassworld = By.id("txtPassword");
    private static By btnLogin = By.id("btnLogin");
    private static By HrmHeader = By.id("logInPanelHeading");

=======
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
    private static By TxtUsername= By.id("txtUsername");
    private static By TxtPassworld= By.id("txtPassword");
    private static By btnLogin= By.id("btnLogin");
    private static By HrmHeader =By.id("logInPanelHeading");
    private static By clickwelcome =By.id("welcome");
    private static By logout =By.xpath("//a[@href=\"/index.php/auth/logout\"]");



    public static void waittime(){
        waiTillClickable(logout,3);
    }
>>>>>>> 2218464b163878f65cb71235f0c097cb82fcb88b
    public static boolean isHrmLoginPageDisplayed() {
        return getDriver().findElement(HrmHeader).isDisplayed();

    }
<<<<<<< HEAD
=======
    public static void setUserName(String username) {
        getDriver().findElement(TxtUsername).sendKeys(username);
        LOGGER.info("Entered Username");
>>>>>>> 2218464b163878f65cb71235f0c097cb82fcb88b

    public static void setUserName(String username) {
        getDriver().findElement(TxtUsername).sendKeys(username);
        LOGGER.info("Entered Username");

    }

    public static void setPass(String pass) {
        getDriver().findElement(TxtPassworld).sendKeys(pass);

    }

    public static void ClickLogin() {
        getDriver().findElement(btnLogin).click();

    }

<<<<<<< HEAD
}
=======
    }
    public static void Clickwelcome() {
        getDriver().findElement(clickwelcome).click();
        LOGGER.info("Clicked Welcome");

    }
}
>>>>>>> 2218464b163878f65cb71235f0c097cb82fcb88b
