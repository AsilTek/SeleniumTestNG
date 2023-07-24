package tests.day17_ReusableMethods_and_XmlFiles;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_SwitchToNewWindow {

    @Test
    public void test01(){

        // go to the https://the-internet.herokuapp.com/iframe
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");

        // click on elemental selenium link
        Driver.getDriver().findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

        // title of new tab is "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"
        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");

        String expectedTitleText = "Make sure your code lands";
        String actualTitleText = Driver.getDriver().findElement(By.tagName("h2")).getText();
        Assert.assertEquals(expectedTitleText,actualTitleText);

        // switch to new tab

        Driver.quitDriver();
    }
}
