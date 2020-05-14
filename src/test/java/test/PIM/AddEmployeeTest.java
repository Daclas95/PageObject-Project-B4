package test.PIM;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pim.AddEmployee;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class AddEmployeeTest extends TestBase {
    @Test
    public void AddEmployeeTest(){

        AddEmployee.setPass("Nive");
        AddEmployee.setPass("Ruby");
        AddEmployee.setPass("Nive");
        AddEmployee.setPass("");
        AddEmployee.setPass("");
        AddEmployee.setPass("");
//        AddEmployee.ClickSave();



    }
}
