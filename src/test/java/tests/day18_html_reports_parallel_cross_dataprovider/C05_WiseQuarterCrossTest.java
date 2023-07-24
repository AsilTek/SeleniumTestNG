package tests.day18_html_reports_parallel_cross_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C05_WiseQuarterCrossTest extends TestBaseCross {

    @Test
    public void test01(){

        driver.get("https://wisequarter.com/");
        String actualUrl = driver.getCurrentUrl();
        String expectedWord = "wisequarter";
        Assert.assertTrue(actualUrl.contains(expectedWord));
    }

}
