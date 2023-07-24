package tests.day14_testNG_framework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTest {

    @Test
    public void test01(){

        Driver.getDriver().get("https://amazon.com/");

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);

        String expectedResultWord = "Nutella";
        String actualResultText = amazonPage.amazonResult.getText();

        Assert.assertTrue(actualResultText.contains(expectedResultWord));
    }
}
