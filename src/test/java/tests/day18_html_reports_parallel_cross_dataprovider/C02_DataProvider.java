package tests.day18_html_reports_parallel_cross_dataprovider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] wordsToSearchInAmazon() {

        Object[][] wordsToSearchInAmazonArray = {{"Nutella"}, {"Java"}, {"Samsung"}, {"Iphone"}, {"Cokokrem"}};

        return wordsToSearchInAmazonArray;
    }

    @Test(dataProvider = "wordsToSearchInAmazon")
    public void test01(String wordToSearch){

        //1- go to the https:/www.amazon.com/
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //2- search for Nutella
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys(wordToSearch+ Keys.ENTER);


        //3 - test that result text has Nutella
        String expectedResult = wordToSearch;
        String actualResult = amazonPage.amazonResult.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));

        Driver.closeDriver();

    }
}
