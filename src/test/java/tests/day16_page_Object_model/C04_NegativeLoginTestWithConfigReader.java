package tests.day16_page_Object_model;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegativeLoginTestWithConfigReader {

    QualityDemyPage qualityDemyPage;

    @Test(priority = 1)
    public void invalidEmailTest(){

        QualityDemyPage qualityDemyPage = new QualityDemyPage();
        //1) go to the "https://www.qualitydemy.com/
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrl"));

        //2) click login button
        qualityDemyPage.homePageSignInButton.click();

        //3) enter a invalid email in emailTextBox  (valid email : a@a.com )
        qualityDemyPage.logInPageEmailTextBox.sendKeys(ConfigReader.getProperty("qualityDemyInvalidEmail"));

        //4) enter a valid password in passwordTextBox ( Az.123123123 )
        qualityDemyPage.logInPagePasswordTextBox.sendKeys(ConfigReader.getProperty("qualityDemyValidPassword"));

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
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrl"));

        //2) click login button
        qualityDemyPage.homePageSignInButton.click();

        //3) enter a valid email in emailTextBox  (valid email : a@a.com )
        qualityDemyPage.logInPageEmailTextBox.sendKeys(ConfigReader.getProperty("qualityDemyValidEmail"));

        //4) enter a invalid password in passwordTextBox ( Az.123123123 )
        qualityDemyPage.logInPagePasswordTextBox.sendKeys("qualityDemyInvalidPassword");

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
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrl"));

        //2) click login button
        qualityDemyPage.homePageSignInButton.click();

        //3) enter a invalid email in emailTextBox  (valid email : a@a.com )
        qualityDemyPage.logInPageEmailTextBox.sendKeys(ConfigReader.getProperty("qualityDemyInvalidEmail"));

        //4) enter a invalid password in passwordTextBox ( Az.123123123 )
        qualityDemyPage.logInPagePasswordTextBox.sendKeys("qualityDemyInvalidPassword");

        //5) click login button
        qualityDemyPage.logInPageLoginButton.click();

        //6) test that user could not be able to login
        Assert.assertTrue(qualityDemyPage.enterYourValidCredentials.isDisplayed());
        //System.out.println(qualityDemyPage.enterYourValidCredentials.getText());

        Driver.closeDriver();
    }
}
