package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class DashboardPage extends PageBase {
<<<<<<< HEAD
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(LoginPage.class));
=======
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(DashboardPage.class));
>>>>>>> 235f6f317ebf219305b0e71bffccd40f61ce3bb8
    private static By HrmDashboardHeader =By.xpath("//h1");

    public static boolean isHrmDashboardPageDisplayed() {
        return getDriver().findElement(HrmDashboardHeader).isDisplayed();

    }
}
