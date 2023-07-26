package tests.day14_testNG_framework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class C04_Tripandway {

    @Test
    public void test01() {

            Driver.getDriver().get("https://qa.tripandway.com/");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();

        // Sayfayı 500 piksel aşağıya doğru kaydır
        ReusableMethods.waitFor(2);
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //jsExecutor.executeScript("window.scrollBy(0, 5500);"); ikinci yol
        ReusableMethods.waitFor(2);
        WebElement textBox = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("abdc@abd.com");
        ReusableMethods.waitFor(2);
        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();
        ReusableMethods.waitFor(2);
        //Sayfanin en ustune gider
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        ReusableMethods.waitFor(2);


        Driver.closeDriver();
    }
}
