package tests.day18_html_reports_parallel_cross_dataprovider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBasedReport;

public class C01_CreatingReport extends TestBasedReport {



    @Test
    public void test01(){

        extentTest = extentReports.createTest("Amazon Nutella Test", "User should be able to search for Nutella");

        //1- go to the https:/www.amazon.com/
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("User reached the Amazon website");

        //2- search for Nutella
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys(ConfigReader.getProperty("amazonWordToSearch")+ Keys.ENTER);
        extentTest.info("User searched for Nutella");

        //3 - test that result text has Nutella
        String expectedResult = ConfigReader.getProperty("amazonWordToSearch");
        String actualResult = amazonPage.amazonResult.getText();
        extentTest.info("System saved the result");


        Assert.assertTrue(actualResult.contains(expectedResult));
        extentTest.pass("Tested that result contains the expected word"); // we should use .pass for each assert
    }
}
