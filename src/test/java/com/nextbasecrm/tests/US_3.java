package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_3 {
    /**
     * As a user, I should log out from the NextBaseCRM app.
     */

    NextbaseCrmProject nextbaseCrmProject;
    Faker faker;

    @BeforeMethod
    public void setUp() {
        nextbaseCrmProject = new NextbaseCrmProject();
        faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }

    @Test (priority = 1)
    public void testUserName() {
        /**
         * Test cases #1
         * Description:  Users log out from the app
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the user profile name
         *             Users select the “Log Out” option
         *             Verify the user back to the login page
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(2);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.userProfil.click();
        nextbaseCrmProject.logOutBtn.click();
        nextbaseCrmProject.loginPageVerify.isDisplayed();

        Assert.assertEquals(nextbaseCrmProject.loginPageVerify.getText(),"Authorization","FAILED!");

    }

    @Test (priority = 2)
    public void testHelpDesk() {
        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(2);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.userProfil.click();
        nextbaseCrmProject.logOutBtn.click();
        nextbaseCrmProject.loginPageVerify.isDisplayed();

        Assert.assertEquals(nextbaseCrmProject.loginPageVerify.getText(),"Authorization","FAILED!");
    }

    @Test (priority = 3)
    public void testMarketing() {
        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(2);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.userProfil.click();
        nextbaseCrmProject.logOutBtn.click();
        nextbaseCrmProject.loginPageVerify.isDisplayed();

        Assert.assertEquals(nextbaseCrmProject.loginPageVerify.getText(),"Authorization","FAILED!");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
