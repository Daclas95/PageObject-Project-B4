package com.pages.admin;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class HrmJob extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(HrmJob.class));
    private static By HrmHeadAdmin = By.id("menu_admin_viewAdminModule");
    private static By HrmJobDroDown = By.id("menu_admin_Job");
    private static By MenuJopTitles = By.id("menu_admin_viewJobTitleList");
   //private static By MenuPayGrades = By.id("menu_admin_viewPayGrades");
    private static By MenuEmplStatus = By.id("menu_admin_employmentStatus");
    private static By MenuJobCatogory = By.id("menu_admin_jobCategory");
    private static By MenuWorkShift = By.id("menu_admin_workShift");
    private static By Buttonadd= By.id("btnAdd");

    private static By CheckCEO = By.id("ohrmList_chkSelectRecord_5");
    private static By ButtJobDelete= By.id("btnDelete");
    private static By ButDeleteConfirm = By.id("dialogDeleteBtn");


    private static By Txtjobtitle = By.id("jobTitle_jobTitle");
    private static By Txtjobdescp = By.id("jobTitle_jobDescription");
    private static By Txtjobspec = By.id("jobTitle_jobSpec");
    private static By Txtilnote = By.id("jobTitle_note");
    private static By ButJobtiSave = By.id("btnSave");





    public static void clickAdminPanel() {
        getDriver().findElement(HrmHeadAdmin).click();
        LOGGER.info("Clicked Admin Panel");


    }

    public static void clickJobTab() {
        getDriver().findElement(HrmJobDroDown).click();
        LOGGER.info("Clicked on the Job pannel");


    }

    public static void clickJobTitles() {
        getDriver().findElement(MenuJopTitles).click();
        LOGGER.info("Clicked on  the job Title Panel");


    }

    public static void clickButAdd() {
        getDriver().findElement(Buttonadd).click();
        LOGGER.info("Clicked on  the Add Button");


    }

    public static void setjobtitle(String jobtitle) {
        getDriver().findElement(Txtjobtitle).sendKeys(jobtitle);
        LOGGER.info("Entered the job title");


    }

    public static void setJobdesc(String description) {
        getDriver().findElement(Txtjobdescp).sendKeys(description);
        LOGGER.info("Entered the job Description");


    }



    public static void chooseJobSpeci(String specification) {
        getDriver().findElement(Txtjobspec).click();
        LOGGER.info("Clicked on the button");
       // getDriver().findElement(Txtjobspec).sendKeys("CDA600.doc");
        LOGGER.info("Selected the file");


    }

    public static void setNote(String note) {
        getDriver().findElement(Txtilnote).sendKeys(note);
        LOGGER.info("Entered the job Note");


    }

    public static void clickJobSave() {
        getDriver().findElement(ButJobtiSave).click();
        LOGGER.info("Clicked on the save button");


    }

    public static void clickJobCheckBox() {
        getDriver().findElement(CheckCEO).click();
        LOGGER.info("Clicked on  the Check box");


    }

    public static void clickDelBut() {
        getDriver().findElement(ButtJobDelete).click();
        LOGGER.info("Clicked on  the Delete Button");


    }

    public static void clickDeletConfirm() {
        getDriver().findElement(ButDeleteConfirm).click();
        LOGGER.info("Clicked on  the OK to DELETE confirm");


    }


    public static class User  extends PageBase {
        private static final Logger LOGGER = Logger.getLogger(String.valueOf(HrmJob.User.class));
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
}
