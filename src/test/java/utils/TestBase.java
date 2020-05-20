package utils;




import com.pages.LoginPage;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;



import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class TestBase {
    public SoftAssert softAssert;


    private static final Logger LOGGER = Logger.getLogger(TestBase.class);

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("Test Running " + this.getClass().toString());
    }
<<<<<<< HEAD




=======
    //ajxhusduhdusssssssssssssssss
>>>>>>> 2218464b163878f65cb71235f0c097cb82fcb88b
    @BeforeMethod(alwaysRun = true)
    public void loadBrowser() {
        LOGGER.info("Initiate Browser");


            // LoginPage.implicitWait(20);
        /*LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();*/

            try {

                PageBase.initiateDriver();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            LOGGER.info("Browser Initiated");


//        LoginPage.setUserName("Admin");
//        LoginPage.setPass("admin123");
//        LoginPage.ClickLogin();


    }




    @BeforeMethod(alwaysRun = true)
    public void Login() {
        softAssert = new SoftAssert();




    }
    //ajxhusduhdusssssssssssssssss
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        softAssert = new SoftAssert();
    }

    @BeforeMethod(alwaysRun = true)
    public void nameBefore(Method method) {
        LOGGER.info("Test name: " + method.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        LOGGER.info("Closing Browser");
       PageBase.closeDriver();
        LOGGER.info("Browser Closed");
    }

<<<<<<< HEAD

=======
        LoginPage.Clickwelcome();
        LoginPage.waittime();
        LoginPage.ClickLogout();

        LOGGER.info("Closing Browser");
        PageBase.closeDriver();
        LOGGER.info("Browser Closed");
    }
    //ajxhusduhdusssssssssssssssss
>>>>>>> 2218464b163878f65cb71235f0c097cb82fcb88b
    @AfterMethod(alwaysRun = true)
    public void afterMethod(Method method, ITestResult result) {
        LOGGER.info("Executed test case name:" + method.getName() + " Execution Results : " + result.toString());
    }
}
