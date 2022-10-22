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

public class US_6 {
    /**
     *As a user, I want to see all the options under the MORE tab on the homepage.
     */

    NextbaseCrmProject nextbaseCrmProject;
    Faker faker;

    @BeforeMethod
    public void setUp() {
        nextbaseCrmProject = new NextbaseCrmProject();
        faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }

    @Test
    public void testUser() {
        /**
         * Test cases #1
         * Description:  Users view all options under the MORE tab
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the MORE tab
         *             Verify the users see 4 options:
         * 			File
         * Appreciation
         * Announcement
         * Workflow
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.moreTab.click();

        Assert.assertTrue(nextbaseCrmProject.fileUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.appreciationUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.announcementUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.workFlowUnderMore.isDisplayed());

        System.out.println(nextbaseCrmProject.fileUnderMore.getText());
        System.out.println(nextbaseCrmProject.appreciationUnderMore.getText());
        System.out.println(nextbaseCrmProject.announcementUnderMore.getText());
        System.out.println(nextbaseCrmProject.workFlowUnderMore.getText());

    }

    @Test
    public void testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.moreTab.click();

        Assert.assertTrue(nextbaseCrmProject.fileUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.appreciationUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.announcementUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.workFlowUnderMore.isDisplayed());

        System.out.println(nextbaseCrmProject.fileUnderMore.getText());
        System.out.println(nextbaseCrmProject.appreciationUnderMore.getText());
        System.out.println(nextbaseCrmProject.announcementUnderMore.getText());
        System.out.println(nextbaseCrmProject.workFlowUnderMore.getText());
    }

    @Test
    public void testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.moreTab.click();

        Assert.assertTrue(nextbaseCrmProject.fileUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.appreciationUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.announcementUnderMore.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.workFlowUnderMore.isDisplayed());

        System.out.println(nextbaseCrmProject.fileUnderMore.getText());
        System.out.println(nextbaseCrmProject.appreciationUnderMore.getText());
        System.out.println(nextbaseCrmProject.announcementUnderMore.getText());
        System.out.println(nextbaseCrmProject.workFlowUnderMore.getText());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
