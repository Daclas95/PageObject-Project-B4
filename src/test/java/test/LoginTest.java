package test;

import com.pages.AdminPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

import utils.TestBase;

public class LoginTest extends TestBase {

    @Test

    public  void loginTest() throws InterruptedException {
        // softAssert = new SoftAssert();
        // softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"HrmLogin Page Not Display") ;

<<<<<<< HEAD
                                //*
        /*HrmJob.clickAdminPanel();
        HrmJob.clickJobTab();*/
        //AdminPage.implicitWait(3000);
        HrmJob.clickJobTitles();
        HrmJob.clickButAdd();
        HrmJob.setjobtitle("scientist");
        HrmJob.setJobdesc("do practical");
        HrmJob.chooseJobSpeci("Desktop/New Text Document.txt");
        HrmJob.setNote("Noted their wrk");
        HrmJob.clickJobSave();
=======
        // Login Panel Test
>>>>>>> 0d035bc786d8f33a3d5a29f81eac5f6db57d4d41



        // AdminPage.isAdminPageHeaderDisplayed();
        // softAssert.assertAll();
        // Company General Information Test
        


    }

}
