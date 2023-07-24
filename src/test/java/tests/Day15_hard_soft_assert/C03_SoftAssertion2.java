package tests.Day15_hard_soft_assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C03_SoftAssertion2 {

    @Test(groups = "reg2")
    public void test01(){

        // amazon.com
        Driver.getDriver().get("https://www.amazon.com/");

        // verify that you are in amazon.com
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "amazon.com";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualURL.contains(expectedURL));
        softAssert.assertAll();

        // search for nutella and click on the firt product
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        amazonPage.firstProduct.click();

        // verify that you searched for nutella
        String expectedResult = "Nutella";
        String actualResult = amazonPage.amazonResult.getText();
        softAssert.assertTrue(actualResult.contains(expectedResult));

        // search for java
        amazonPage.amazonSearchBox.clear();
        amazonPage.amazonSearchBox.sendKeys("Java"+Keys.ENTER);

        // verify that there are more than 1000 results
        String[] arr = amazonPage.amazonResult.getText().split(" "); //3,000
        String numberStr = arr[3].replace(",",""); //3000
        int resultNumber = Integer.valueOf(numberStr);
        softAssert.assertTrue(resultNumber > 1000);

        // close driver
        //Driver.getDriver().close(); or we can create a method for closing driver and execute as below.
        Driver.closeDriver();
    }

}
