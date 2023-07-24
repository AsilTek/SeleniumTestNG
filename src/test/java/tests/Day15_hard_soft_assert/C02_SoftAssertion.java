package tests.Day15_hard_soft_assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_SoftAssertion {

    @Test(groups = "reg2")
    public void test01(){

        //if we want to use soft assertion, we should create an object from SoftAssert class.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(6 > 3);
        System.out.println("After first soft assertion execution");

        softAssert.assertTrue(6 > 5);
        System.out.println("After second soft assertion execution");

        softAssert.assertEquals(6 , 6);
        System.out.println("After third soft assertion execution");

        //to test soft assertion, we need to use assertAll() method, if not it will not test anything.
        softAssert.assertAll();
        System.out.println("After all");

    }
}
