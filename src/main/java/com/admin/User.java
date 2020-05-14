package com.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.PageBase;

import java.util.logging.Logger;


public class User  extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(User.class));
    //------------------------------------------------
    private static By Admin = By.id("menu_admin_viewAdminModule");
    private static By UserManagement= By.id("menu_admin_UserManagement");
    private static By User = By.id("menu_admin_viewSystemUsers");
    //  private static By SystemUserHeader = By.id("//*[@id=\"systemUser-information\"]/a");

    // ----------------------- User page -------------------------------
    private static By TxtUsername    = By.id("searchSystemUser_userName");
    private static By UserRole       = By.id("searchSystemUser_userType");
    private static By TxtEmployeeName= By.id("searchSystemUser_employeeName_empName");
    private static By Status         = By.id("searchSystemUser_status");

    private static By btnSearch =By.id("searchBtn");
    private static By btnReset =By.id("resetBtn");

    private static By btnAdd =By.id("btnAdd");
    //private static By btnDelete = By.id("btnDelete");

//-------------------------- Add user -----------------------------
    private static By TxtUserrole = By.id("systemUser_userType");
    private static By TxtEmpName  = By.id("systemUser_employeeName_empName");
    private static By TxtUname    = By.id("systemUser_userName");
    private static By clickstatus = By.id("systemUser_status");
    private static By TxtPassword = By.id("systemUser_password");
    private static By TxtConPassword = By.id("systemUser_confirmPassword");
    private static By btnclickSave   = By.id("btnSave");



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
        getDriver().findElement(UserRole).isSelected();
    }
    public static void setTxtEmployeeName(String name) {
        getDriver().findElement(TxtEmployeeName).sendKeys(name);
    }
    public static void setStatus() {
        getDriver().findElement(Status).click();
    }


    public static void clickSearch() {
        getDriver().findElement(btnSearch).click();
    }
    public static void clickReset() {
        getDriver().findElement(btnReset).click();
    }

    public static void clickAdd() {
        getDriver().findElement(btnAdd).click();
    }
    public static void wait(int seconds){
        PageBase.implicitWait(seconds);
    }
    public static void clickUserRole(String UserRole) {
        getDriver().findElement(TxtUserrole).isSelected();
    }
    public static void setEmpName(String empName) {
        getDriver().findElement(TxtEmpName).sendKeys( empName);
    }
    public static void clickStatus() {
        getDriver().findElement(clickstatus).click();
    }
    public static void setUname(String Uname) {
        getDriver().findElement(TxtUname).sendKeys(Uname);
    }
    public static void setTxtPassword(String password) {
        getDriver().findElement(TxtPassword).sendKeys(password);
    }
    public static void  setTxtConPassword(String conpassword) {
        getDriver().findElement(TxtConPassword).sendKeys(conpassword);
    }

    public static void clickSave() {
        getDriver().findElement(btnclickSave).click();
    }

   /* public static void clickDelete(){
        getDriver().findElement(btnDelete).click();
    }*/
}

