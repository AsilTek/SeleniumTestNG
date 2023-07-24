package tests.day18_html_reports_parallel_cross_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Driver;

public class DataProviderCalisma {

    //Data Driven Testing DDT is using DataProvider
    //For example, we are going to test functionality of Log in part of website with many sample ID and password.
    //We will create @Test as usual for one of ID and Password, but we make them dynamic by adding parameters to method test01
    //to use this feature, we will add dataProvider keyword beside the @Test annotation and will give name of method we will create
    //then we will hover over the name to create method fast
    //Last, we will pass our parameter values into Object data type Array.

    @DataProvider
    public static Object[][] googleSearch() {

        Object[][] words = {{"Iphone"}, {"Samsung"}, {"Motorola"} ,{"Nokia"}};

        return words;
    }

    @Test(dataProvider = "googleSearch")
    public void test01(String words){

        Driver.getDriver().get("https://www.google.com/");

        WebElement google = Driver.getDriver().findElement(By.id("APjFqb"));
        google.sendKeys(words+ Keys.ENTER);

        Driver.closeDriver();

    }
}
