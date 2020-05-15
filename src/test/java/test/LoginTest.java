package test;

import com.pages.AdminPage;

import com.pages.admin.HrmJob;
import com.pages.admin.LoginPage;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class LoginTest extends TestBase {

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
        


    }

}
