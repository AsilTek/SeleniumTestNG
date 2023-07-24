package tests.Day15_hard_soft_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_HardAssertion {

    /*
    There are two different assertion types
    1- Hard Assertion : When we use hard assertion code will be executed until the first failure. At the first failure,
    system will stop and will not execute the rest. In the console, we will see the messages for the first failure.
    2- Soft Assertion :
     */


    @Test
    public void test01(){
        Assert.assertTrue(10 > 7);
        System.out.println("After first Assert Execution");

        Assert.assertTrue(2 < 3);
        System.out.println("After second Assert Execution");

        Assert.assertEquals(6,6);
        System.out.println("After third Assert Execution");
    }
}
