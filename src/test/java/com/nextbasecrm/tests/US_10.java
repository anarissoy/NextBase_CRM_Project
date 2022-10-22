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

public class US_10 {
    /**
     * As a user, I want to create a task with just task content from the TASK tab.
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
        /***
         * Test cases #1
         * Description:  Users create tasks successfully
         * Environment:  https://login2.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the TASK tab
         *             Users write task titles and task content/message
         *     Users click the SEND button
         *             Verify the task is displayed on the feed
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.taskBtn.click();

        nextbaseCrmProject.taskHeadMsg.sendKeys(faker.bothify("Java is the best ###"));

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.taskMsgFrame);

        nextbaseCrmProject.taskMsg.sendKeys(faker.bothify("100% Agree ###"));
        Driver.getDriver().switchTo().defaultContent();

        nextbaseCrmProject.taskSendBtn.click();

        Assert.assertTrue(nextbaseCrmProject.taskVerify.isDisplayed());
        System.out.println("nextbaseCrmProject.taskVerify.isDisplayed() = " + nextbaseCrmProject.taskVerify.isDisplayed());
    }

    @Test (priority = 2)
    public void TC1_testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.taskBtn.click();

        nextbaseCrmProject.taskHeadMsg.sendKeys(faker.bothify("Java is the best ###"));

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.taskMsgFrame);

        nextbaseCrmProject.taskMsg.sendKeys(faker.bothify("100% Agree ###"));
        Driver.getDriver().switchTo().defaultContent();

        nextbaseCrmProject.taskSendBtn.click();

        Assert.assertTrue(nextbaseCrmProject.taskVerify.isDisplayed());
        System.out.println("nextbaseCrmProject.taskVerify.isDisplayed() = " + nextbaseCrmProject.taskVerify.isDisplayed());
    }

    @Test (priority = 3)
    public void TC1_testMarketing() {
        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.taskBtn.click();

        nextbaseCrmProject.taskHeadMsg.sendKeys(faker.bothify("Java is the best ###"));

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.taskMsgFrame);

        nextbaseCrmProject.taskMsg.sendKeys(faker.bothify("100% Agree ###"));
        Driver.getDriver().switchTo().defaultContent();

        nextbaseCrmProject.taskSendBtn.click();

        Assert.assertTrue(nextbaseCrmProject.taskVerify.isDisplayed());
        System.out.println("nextbaseCrmProject.taskVerify.isDisplayed() = " + nextbaseCrmProject.taskVerify.isDisplayed());
    }

    @Test (priority = 4)
    public void TC2_testUser() {
        /**
         * Test cases #2
         * Description:  Users see the warning message for the empty task
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the TASK tab
         *     Users click the SEND button
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.taskBtn.click();
        BrowserUtils.sleep(2);

        nextbaseCrmProject.taskSendBtn.click();
        BrowserUtils.sleep(2);

        Assert.assertTrue(nextbaseCrmProject.taskEmptySendBtnErrorMsg.isDisplayed());

        System.out.println("Error Message is Displayed: " + nextbaseCrmProject.taskEmptySendBtnErrorMsg.getText());

    }

    @Test (priority = 5)
    public void TC2_testHelpdesk() {
        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.taskBtn.click();
        BrowserUtils.sleep(2);

        nextbaseCrmProject.taskSendBtn.click();
        BrowserUtils.sleep(2);

        Assert.assertTrue(nextbaseCrmProject.taskEmptySendBtnErrorMsg.isDisplayed());

        System.out.println("Error Message is Displayed: " + nextbaseCrmProject.taskEmptySendBtnErrorMsg.getText());

    }

    @Test (priority = 6)
    public void TC2_testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.taskBtn.click();
        BrowserUtils.sleep(2);

        nextbaseCrmProject.taskSendBtn.click();
        BrowserUtils.sleep(2);

        Assert.assertTrue(nextbaseCrmProject.taskEmptySendBtnErrorMsg.isDisplayed());

        System.out.println("Error Message is Displayed: " + nextbaseCrmProject.taskEmptySendBtnErrorMsg.getText());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
