package com.pim;

import org.openqa.selenium.By;

import java.util.logging.Logger;

import static utils.PageBase.getDriver;

public class AddEmployee {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddEmployee.class));
    private static By firstName = By.id("firstName");
    private static By middleName = By.id("middleName");
    private static By lastName = By.id("lastName");
    private static By employeeId = By.id("employeeId");
    private static By photofile = By.id("photofile");
    private static By chkLogin = By.id("chkLogin");
    private static By btnSave = By.id("btnSave");

    public static void setFirstName(String firstName) {
        getDriver().findElement(By.id(firstName)).sendKeys(firstName);
        LOGGER.info("Entered firstName");
    }

    public static void setMiddleName(String middleNames) {
        getDriver().findElement(middleName).sendKeys(middleNames);
        LOGGER.info("Entered Username");

    }

    public static void setLastName(String lastNames) {
        getDriver().findElement(lastName).sendKeys(lastNames);
        LOGGER.info("Entered Username");

    }


    public static void setPass(String pass) {
        getDriver().findElement(firstName).sendKeys(pass);
    }
}
