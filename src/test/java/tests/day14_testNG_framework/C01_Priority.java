package tests.day14_testNG_framework;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

public class C01_Priority {

    //TestNG
    //with priority keyword beside the Test annotation gives that test specific order to run (default value is 0 if not assigned)
    //if we do not use priority, TestNG will run tests in alphabetical order according to method names.
    @Test(priority = 17,groups = "reg1")
    public void firstTest(){

        System.out.println("First test is executed");

    }
    @Test(priority = 10,groups = "reg2")
    public void secondTest(){

        System.out.println("Second test is executed");

    }
    @Test(priority = 5,groups = "smoke1")
    public void thirdTest(){

        System.out.println("Third test is executed");

    }


}
