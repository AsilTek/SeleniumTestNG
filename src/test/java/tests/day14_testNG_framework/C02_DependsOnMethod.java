package tests.day14_testNG_framework;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class C02_DependsOnMethod {

    @Test(groups = "reg1")
    public void firstTest(){
        System.out.println("First test is executed");
    }

    @Test(dependsOnMethods = "thirdTest")
    public void secondTest(){
        System.out.println("Second test is executed");
    }

    @Test()
    public void thirdTest(){
        System.out.println("Third test is executed");
    }
}

//with the dependsOnMethods, we can go only one before