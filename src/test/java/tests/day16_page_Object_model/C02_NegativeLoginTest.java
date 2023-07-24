package tests.day16_page_Object_model;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.Driver;
//1- Test invalid email
//2- Test invalid password
//3- Test invalid email & password

public class C02_NegativeLoginTest {

    QualityDemyPage qualityDemyPage;

    @Test(priority = 1)
    public void invalidEmailTest(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        //1) go to the "https://www.qualitydemy.com/
        Driver.getDriver().get("https://www.qualitydemy.com/");

        //2) click login button
        qualityDemyPage.homePageSignInButton.click();

        //3) enter a invalid email in emailTextBox  (valid email : a@a.com )
        qualityDemyPage.logInPageEmailTextBox.sendKeys("aqweqwr@a.com");

        //4) enter a valid password in passwordTextBox ( Az.123123123 )
        qualityDemyPage.logInPagePasswordTextBox.sendKeys("Az.123123123");

        //5) click login button
        qualityDemyPage.logInPageLoginButton.click();

        //6) test that user could not be able to login
        Assert.assertTrue(qualityDemyPage.enterYourValidCredentials.isDisplayed());

        Driver.closeDriver();
    }
    @Test(priority = 2)
    public void invalidPasswordTest(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        //1) go to the "https://www.qualitydemy.com/
        Driver.getDriver().get("https://www.qualitydemy.com/");

        //2) click login button
        qualityDemyPage.homePageSignInButton.click();

        //3) enter a valid email in emailTextBox  (valid email : a@a.com )
        qualityDemyPage.logInPageEmailTextBox.sendKeys("a@a.com");

        //4) enter a invalid password in passwordTextBox ( Az.123123123 )
        qualityDemyPage.logInPagePasswordTextBox.sendKeys("asdasd123");

        //5) click login button
        qualityDemyPage.logInPageLoginButton.click();

        //6) test that user could not be able to login
        Assert.assertTrue(qualityDemyPage.enterYourValidCredentials.isDisplayed());

        Driver.closeDriver();
    }
    @Test(priority = 3)
    public void invalidEmailAndPasswordTest(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        //1) go to the "https://www.qualitydemy.com/
        Driver.getDriver().get("https://www.qualitydemy.com/");

        //2) click login button
        qualityDemyPage.homePageSignInButton.click();

        //3) enter a invalid email in emailTextBox  (valid email : a@a.com )
        qualityDemyPage.logInPageEmailTextBox.sendKeys("aasdasdad@a.com");

        //4) enter a invalid password in passwordTextBox ( Az.123123123 )
        qualityDemyPage.logInPagePasswordTextBox.sendKeys("asdasd123");

        //5) click login button
        qualityDemyPage.logInPageLoginButton.click();

        //6) test that user could not be able to login
        Assert.assertTrue(qualityDemyPage.enterYourValidCredentials.isDisplayed());
        //System.out.println(qualityDemyPage.enterYourValidCredentials.getText());

        Driver.closeDriver();
    }
}
