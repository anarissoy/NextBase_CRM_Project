package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_11 {
    /**
     * As a user, I want to access my profile page.
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
    public void testUser() {
        /**
         * Test cases #1
         * Description:  Users view all options on my profile page
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the user profile
         * 	    Users select the My Profile option
         *             Verify the users see 4 options:
         * General
         * Drive
         * Tasks
         * Calendar
         * Conversations
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.userProfil.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.myProfil.click();

        Assert.assertTrue(nextbaseCrmProject.generalBtn.isDisplayed());
        System.out.println("General: " + nextbaseCrmProject.generalBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.driveBtn.isDisplayed());
        System.out.println("Drive: " + nextbaseCrmProject.driveBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.tasksBtn.isDisplayed());
        System.out.println("Tasks: " + nextbaseCrmProject.tasksBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.calendarBtn.isDisplayed());
        System.out.println("Calendar: " + nextbaseCrmProject.calendarBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.conversationsBtn.isDisplayed());
        System.out.println("Conversations: " + nextbaseCrmProject.conversationsBtn.isDisplayed());
    }

    @Test (priority = 2)
    public void testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.userProfil.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.myProfil.click();

        Assert.assertTrue(nextbaseCrmProject.generalBtn.isDisplayed());
        System.out.println("General: " + nextbaseCrmProject.generalBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.driveBtn.isDisplayed());
        System.out.println("Drive: " + nextbaseCrmProject.driveBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.tasksBtn.isDisplayed());
        System.out.println("Tasks: " + nextbaseCrmProject.tasksBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.calendarBtn.isDisplayed());
        System.out.println("Calendar: " + nextbaseCrmProject.calendarBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.conversationsBtn.isDisplayed());
        System.out.println("Conversations: " + nextbaseCrmProject.conversationsBtn.isDisplayed());
    }

    @Test (priority = 3)
    public void testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.userProfil.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.myProfil.click();

        Assert.assertTrue(nextbaseCrmProject.generalBtn.isDisplayed());
        System.out.println("General: " + nextbaseCrmProject.generalBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.driveBtn.isDisplayed());
        System.out.println("Drive: " + nextbaseCrmProject.driveBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.tasksBtn.isDisplayed());
        System.out.println("Tasks: " + nextbaseCrmProject.tasksBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.calendarBtn.isDisplayed());
        System.out.println("Calendar: " + nextbaseCrmProject.calendarBtn.isDisplayed());
        Assert.assertTrue(nextbaseCrmProject.conversationsBtn.isDisplayed());
        System.out.println("Conversations: " + nextbaseCrmProject.conversationsBtn.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
