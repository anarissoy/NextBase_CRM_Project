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

public class US_12 { // UserUser
    /**
     * As a user, I should be able to Make Announcements using the Announcements tab.
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
    public void TC1_testUser() {
        /**
         * Test cases #1
         * Description:  Users make Announcements successfully
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *         Users click the MORE tab and select ANNOUNCEMENTS
         *         Users write announcements message
         *         Users click the SEND button
         *         Verify the announcements are displayed on the feed
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moreTab.click();

        nextbaseCrmProject.announcementUnderMore.click();

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.messageFrame);
        nextbaseCrmProject.textMessageArea.sendKeys(faker.bothify("I love Java ###"));
        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.sendButton.click();

        Assert.assertTrue(nextbaseCrmProject.verifyTextMessage.isDisplayed());
        System.out.println("Verified: " + nextbaseCrmProject.verifyTextMessage.getText());
    }

    @Test (priority = 2)
    public void TC1_testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk3"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moreTab.click();

        nextbaseCrmProject.announcementUnderMore.click();

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.messageFrame);
        nextbaseCrmProject.textMessageArea.sendKeys(faker.bothify("I love Java ###"));
        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.sendButton.click();

        Assert.assertTrue(nextbaseCrmProject.verifyTextMessage.isDisplayed());
        System.out.println("Verified: " + nextbaseCrmProject.verifyTextMessage.getText());
    }

    @Test (priority = 3)
    public void TC1_testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing3"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moreTab.click();

        nextbaseCrmProject.announcementUnderMore.click();

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.messageFrame);
        nextbaseCrmProject.textMessageArea.sendKeys(faker.bothify("I love Java ###"));
        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.sendButton.click();

        Assert.assertTrue(nextbaseCrmProject.verifyTextMessage.isDisplayed());
        System.out.println("Verified: " + nextbaseCrmProject.verifyTextMessage.getText());
    }

    @Test (priority = 4)
    public void TC2_testUser() {
        /**
         * * Test cases #2
         *   Description:  Users create announcements without content
         *   Environment:  https://login1.nextbasecrm.com/
         *   Steps::Users are on the homepage
         *          Users click the MORE tab and select ANNOUNCEMENT
         *          Users click the SEND button
         *          Verify “The message title is not specified” warning message is displayed on the page
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username3"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moreTab.click();

        nextbaseCrmProject.announcementUnderMore.click();

        nextbaseCrmProject.sendButton.click();

        Assert.assertTrue(nextbaseCrmProject.emptyMessageSpaceErrorMsg.isDisplayed());

        System.out.println("Verify error message: " + nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText());
    }

    @Test (priority = 5)
    public void TC2_testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk3"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moreTab.click();

        nextbaseCrmProject.announcementUnderMore.click();

        nextbaseCrmProject.sendButton.click();

        Assert.assertTrue(nextbaseCrmProject.emptyMessageSpaceErrorMsg.isDisplayed());

        System.out.println("Verify error message: " + nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText());
    }

    @Test (priority = 6)
    public void TC2_testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing3"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moreTab.click();

        nextbaseCrmProject.announcementUnderMore.click();

        nextbaseCrmProject.sendButton.click();

        Assert.assertTrue(nextbaseCrmProject.emptyMessageSpaceErrorMsg.isDisplayed());

        System.out.println("Verify error message: " + nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
