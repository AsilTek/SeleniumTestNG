package tests.day18_html_reports_parallel_cross_dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class C04_NutellaCrossTest extends TestBaseCross {

    @Test
    public void test01(){

        driver.get(ConfigReader.getProperty("amazonUrl"));
        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        WebElement amazonResultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualResult = amazonResultText.getText();
        String expectedResult = "Nutella";
        Assert.assertTrue(actualResult.contains(expectedResult));





    }

}
