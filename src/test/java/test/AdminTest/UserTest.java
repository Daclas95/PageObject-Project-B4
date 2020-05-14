package test.AdminTest;

import com.admin.User;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import test.LoginTest;
import test.PageLogin;
import utils.TestBase;

public class UserTest extends TestBase {

  //  private Object LoginTest;

    @Test(priority = 1)
    public void UserTest(){
        PageLogin.login();

        User.wait(20);
        User.clickAdmin();
        User.wait(5);
        User.clickUserManagement();
        User.wait(5);
        User.clickUser();

        User.wait(20);
        User.setTxtUsername("vinthusha");
        User.wait(5);
        User.setUserRole("");
        User.wait(5);
        User.setTxtEmployeeName("Mathu");
        User.wait(5);
        User.setStatus();

    }
}
