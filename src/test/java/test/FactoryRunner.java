package test;


import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import test.AdminTest.UserTest;

public class FactoryRunner {
    @Test
    @Factory
   public Object[] runTest(){
        return new Object[]{new LoginTest(),new UserTest()};
    }




}
