package test;

<<<<<<< HEAD
import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import utils.PageBase;
=======
import com.pages.AdminPage;

import com.pages.admin.HrmJob;
import com.pages.admin.LoginPage;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
>>>>>>> 235f6f317ebf219305b0e71bffccd40f61ce3bb8
import utils.TestBase;

public class LoginTest extends TestBase {

<<<<<<< HEAD
    @Test(priority = 1)
    public void LoginTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        softAssert.assertAll();
=======
    @Test

    public  void loginTest() throws InterruptedException {
         softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"HrmLogin Page Not Display");

        HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle("scientist");
        HrmJob.setJobdesc("do practical");
        HrmJob.chooseJobSpeci("Desktop/New Text Document.txt");
        HrmJob.setNote("Noted their wrk");
        HrmJob.clickJobSave();

        // Login Panel Test




        // AdminPage.isAdminPageHeaderDisplayed();
        // softAssert.assertAll();
        // Company General Information Test
        

>>>>>>> 235f6f317ebf219305b0e71bffccd40f61ce3bb8

    }
}
