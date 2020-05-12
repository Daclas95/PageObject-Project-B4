package test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void LoginTest(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Dashboard Page Not Display") ;
        softAssert.assertAll();

    }
}
