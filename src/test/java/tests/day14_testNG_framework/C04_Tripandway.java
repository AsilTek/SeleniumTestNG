package tests.day14_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class C04_Tripandway {

    @Test
    public void test01() {

        WebDriver driver = new ChromeDriver();
         driver.get("https://qa.tripandway.com/");
         WebElement terms = driver.findElement(By.xpath("//a[normalize-space()='Terms and Conditions']"));
        ReusableMethods.waitFor(3);
            terms.click();
//        WebDriver driver = new ChromeDriver();
//         driver.get("https://qa.tripandway.com/admin/login");
//        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//        email.sendKeys("admin01@tripandway.com");
//        ReusableMethods.waitFor(3);
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("123123123");
//        ReusableMethods.waitFor(3);
//        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
//        login.click();
//        ReusableMethods.waitFor(3);
//        Actions actions = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("(//a[text()='Home'])[2]"));
//        String str = element.getText();
//        System.out.println(str);
//        String str2 = "HOME";
//        Assert.assertTrue(str.contains(str2));
//        System.out.println(str);
//        actions.sendKeys(Keys.PAGE_DOWN);
        //actions.moveToElement(element).perform();
        driver.close();

    }

}
