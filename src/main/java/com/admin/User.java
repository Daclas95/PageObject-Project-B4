package com.admin;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;


public class User  extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(User.class));
    private static By Admin = By.id("menu_admin_viewAdminModule");
    private static By UserManagement= By.id("menu_admin_UserManagement");
    private static By User = By.id("menu_admin_viewSystemUsers");
    private static By SystemUserHeader = By.id("//*[@id=\"systemUser-information\"]/a");
    private static By TxtUsername= By.id("searchSystemUser_userName");
    private static By UserRole= By.id("searchSystemUser_userType");
    private static By TxtEmployeeName= By.id("searchSystemUser_employeeName_empName");
    private static By Status =By.id("searchSystemUser_status");

    public static void clickAdmin() {
        getDriver().findElement(Admin).click();

    }
    public static void clickUserManagement() {
        getDriver().findElement(UserManagement).click();

    }
    public static void clickUser() {
        getDriver().findElement(User).click();

    }

    public static void setTxtUsername(String username) {
        getDriver().findElement(TxtUsername).sendKeys(username);

    }
    public static void setUserRole(String userRole) {
        getDriver().findElement(UserRole).sendKeys(userRole);

    }
    public static void setTxtEmployeeName(String name) {
        getDriver().findElement(TxtEmployeeName).sendKeys(name);

    }
    public static void setStatus() {
        getDriver().findElement(Status).click();

    }
    public static void wait(int seconds){
        PageBase.implicitWait(seconds);
    }
}

