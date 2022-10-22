package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_4 {
    /**
     * As a user, I want to see all the options under the user profile.
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
         * Description:  Users view all options under the profile
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the user profile name
         *             Verify the users see 5 options:
         *         		My Profile
         * Edit Profile Settings
         * Themes
         * Configure notifications
         * Logout
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.userProfil.click();

        nextbaseCrmProject.myProfil.isDisplayed();
        nextbaseCrmProject.editProfilSettings.isDisplayed();
        nextbaseCrmProject.themes.isDisplayed();
        nextbaseCrmProject.configureNotification.isDisplayed();
        nextbaseCrmProject.logOutBtn.isDisplayed();
    }

    @Test (priority = 2)
    public void testHelpdesk() {
        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.userProfil.click();

        nextbaseCrmProject.myProfil.isDisplayed();
        nextbaseCrmProject.editProfilSettings.isDisplayed();
        nextbaseCrmProject.themes.isDisplayed();
        nextbaseCrmProject.configureNotification.isDisplayed();
        nextbaseCrmProject.logOutBtn.isDisplayed();
    }

    @Test (priority = 3)
    public void testMarketing() {
        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.userProfil.click();

        nextbaseCrmProject.myProfil.isDisplayed();
        nextbaseCrmProject.editProfilSettings.isDisplayed();
        nextbaseCrmProject.themes.isDisplayed();
        nextbaseCrmProject.configureNotification.isDisplayed();
        nextbaseCrmProject.logOutBtn.isDisplayed();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
