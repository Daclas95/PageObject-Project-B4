package test;

import com.pages.DashboardPage;


import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;


import com.pages.admin.HrmJob;
import com.pages.admin.LoginPage;

import utils.TestBase;


public class LoginTest extends TestBase {


    @Test(priority = 1,groups = "REGRESSION",dataProviderClass = LoginData.class, dataProvider = "LoginTestData", testName = "LoginCorrect")
    public void LoginTest(String username,String Password) {
        softAssert = new SoftAssert();

        softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "Hrm Login Page Not Display");
        LoginPage.setUserName(username);
        LoginPage.setPass(Password);
        LoginPage.ClickLogin();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard Page Not Display");
        softAssert.assertAll();
    }
     @Test(priority = 2)
        public void HrmTest () {
            softAssert = new SoftAssert();


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


//       softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"HrmLogin Page Not Display") ;
//        LoginPage.setUserName("Admin");
//        LoginPage.setPass("admin123");
//        LoginPage.ClickLogin();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Dashboard Page Not Display") ;
        softAssert.assertAll();




            // AdminPage.isAdminPageHeaderDisplayed();
            // softAssert.assertAll();
            // Company General Information Test


        }
    }


