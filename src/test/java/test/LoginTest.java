package test;

import com.pages.DashboardPage;
import com.pages.admin.HrmJob;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void LoginTest(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Dashboard Page Not Display") ;
        softAssert.assertAll();
//*         To Add job detials


                                //*
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

        //* To DELETE JOB DETAILS

    HrmJob.clickJobCheckBox();
    HrmJob.clickDelBut();
    HrmJob.clickDeletConfirm();



    }
}
