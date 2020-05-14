package com.pages.admin;

import org.openqa.selenium.By;
import utils.PageBase;
import java.util.logging.Logger;

<<<<<<< HEAD:src/main/java/com/pages/admin/LoginPage.java
public class LoginPage extends PageBase {
=======
import static utils.PageBase.getDriver;

<<<<<<< HEAD

public class LoginPage {
=======
public class LoginPage extends PageBase
{
    // Login Panel
>>>>>>> c5e26ea64a2a32573a80b8b84623be299b372777
>>>>>>> 0d035bc786d8f33a3d5a29f81eac5f6db57d4d41:src/main/java/com/pages/LoginPage.java
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

<<<<<<< HEAD:src/main/java/com/pages/admin/LoginPage.java
    public static void waittime(){
        waiTillClickable(logout,3);
    }
    public static boolean isHrmLoginPageDisplayed() {
        return getDriver().findElement(HrmHeader).isDisplayed();

    }
    public static void setUserName(String username) {
        getDriver().findElement(TxtUsername).sendKeys(username);
        LOGGER.info("Entered Username");

=======
        else
        {
            LOGGER.info("LoginPanel Display Failed !!");
        }
    }
>>>>>>> 0d035bc786d8f33a3d5a29f81eac5f6db57d4d41:src/main/java/com/pages/LoginPage.java

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


