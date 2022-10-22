package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_8 {
    /**
     * As a user, I want to access the Chat and Calls module.
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
         * Description:  Users view all options in the Chat and Calls module
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the CHAT and Calls module
         *             Verify the users see 4 options:
         * Message
         * Notifications
         * Settings
         * Active Stream
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.chatAndCallsBtn.click();
        BrowserUtils.sleep(1);

        WebElement hoverMsg = nextbaseCrmProject.hoverMessageBtn;
        WebElement hoverNotifications = nextbaseCrmProject.hoverNotificationsBtn;
        WebElement hoverSettings = nextbaseCrmProject.hoverSettingsBtn;
        WebElement hoverActivity = nextbaseCrmProject.hoverActivityBtn;

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(hoverMsg).perform();
        action.moveToElement(hoverNotifications).perform();
        action.moveToElement(hoverSettings).perform();
        action.moveToElement(hoverActivity).perform();

        Assert.assertTrue(hoverMsg.isDisplayed());
        Assert.assertTrue(hoverNotifications.isDisplayed());
        Assert.assertTrue(hoverSettings.isDisplayed());
        Assert.assertTrue(hoverActivity.isDisplayed());

        System.out.println("hoverMsg.isDisplayed() = " + hoverMsg.isDisplayed());
        System.out.println("hoverNotifications.isDisplayed() = " + hoverNotifications.isDisplayed());
        System.out.println("hoverSettings.isDisplayed() = " + hoverSettings.isDisplayed());
        System.out.println("hoverActivity.isDisplayed() = " + hoverActivity.isDisplayed());
    }

    @Test (priority = 2)
    public void testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.chatAndCallsBtn.click();
        BrowserUtils.sleep(1);

        WebElement hoverMsg = nextbaseCrmProject.hoverMessageBtn;
        WebElement hoverNotifications = nextbaseCrmProject.hoverNotificationsBtn;
        WebElement hoverSettings = nextbaseCrmProject.hoverSettingsBtn;
        WebElement hoverActivity = nextbaseCrmProject.hoverActivityBtn;

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(hoverMsg).perform();
        action.moveToElement(hoverNotifications).perform();
        action.moveToElement(hoverSettings).perform();
        action.moveToElement(hoverActivity).perform();

        Assert.assertTrue(hoverMsg.isDisplayed());
        Assert.assertTrue(hoverNotifications.isDisplayed());
        Assert.assertTrue(hoverSettings.isDisplayed());
        Assert.assertTrue(hoverActivity.isDisplayed());

        System.out.println("hoverMsg.isDisplayed() = " + hoverMsg.isDisplayed());
        System.out.println("hoverNotifications.isDisplayed() = " + hoverNotifications.isDisplayed());
        System.out.println("hoverSettings.isDisplayed() = " + hoverSettings.isDisplayed());
        System.out.println("hoverActivity.isDisplayed() = " + hoverActivity.isDisplayed());
    }

    @Test (priority = 3)
    public void testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.chatAndCallsBtn.click();
        BrowserUtils.sleep(1);

        WebElement hoverMsg = nextbaseCrmProject.hoverMessageBtn;
        WebElement hoverNotifications = nextbaseCrmProject.hoverNotificationsBtn;
        WebElement hoverSettings = nextbaseCrmProject.hoverSettingsBtn;
        WebElement hoverActivity = nextbaseCrmProject.hoverActivityBtn;

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(hoverMsg).perform();
        action.moveToElement(hoverNotifications).perform();
        action.moveToElement(hoverSettings).perform();
        action.moveToElement(hoverActivity).perform();

        Assert.assertTrue(hoverMsg.isDisplayed());
        Assert.assertTrue(hoverNotifications.isDisplayed());
        Assert.assertTrue(hoverSettings.isDisplayed());
        Assert.assertTrue(hoverActivity.isDisplayed());

        System.out.println("hoverMsg.isDisplayed() = " + hoverMsg.isDisplayed());
        System.out.println("hoverNotifications.isDisplayed() = " + hoverNotifications.isDisplayed());
        System.out.println("hoverSettings.isDisplayed() = " + hoverSettings.isDisplayed());
        System.out.println("hoverActivity.isDisplayed() = " + hoverActivity.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
