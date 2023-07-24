package tests.Day15_hard_soft_assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.Driver;

public class C04_SoftAssertion3 {

    @Test(groups = "smoke1")
    public void test01() throws InterruptedException {
        //1. Go to “http://zero.webappsecurity.com/”
        Driver.getDriver().get("http://zero.webappsecurity.com/");

        //2. Press the Sign in button
        ZeroPage zeroPage = new ZeroPage();
        zeroPage.signInButton.click();

        //3. Type “username” in the login box
        zeroPage.logInBox.sendKeys("username");

        //4. Type “password” in the Password box
        zeroPage.passBox.sendKeys("password");

        //5. Press the Sign in button
        zeroPage.pressButton.click();

        //6. Go to the Pay Bills page in the online banking menu
        Driver.getDriver().navigate().back();
        zeroPage.onlineBankingMenuButton.click();

        //7. Press the “Purchase Foreign Currency” key
        zeroPage.payBills.click();
        zeroPage.purchaseFC.click();
        Thread.sleep(2000);

        //8. Select Eurozone from the “Currency” drop down menu
        Select select = new Select(zeroPage.currencyDropDown);
        select.selectByVisibleText("Eurozone (euro)");

        //9. Test that "Eurozone (euro)" is selected using soft assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(select.getAllSelectedOptions(),"Eurozone (euro)");

    /*
    10. Test that the DropDown list has these options using soft assert "Select One",
    "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)",
    "Denmark (krone) ","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)",
    "Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand ( dollar)","Sweden (krona)",
    "Singapore (dollar)","Thailand (baht)"
     */
    }

}
