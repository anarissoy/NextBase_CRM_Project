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

public class US_5 {
    /**
     * As a user, I should be able to send simple text messages using the message tab.
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
    public void TC1_verify_user_text_message() {
        /**
         * Test cases #1
         * Description:  Users send text messages successfully
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the MESSAGE tab
         *             Users write test message
         *     Users click the SEND button
         *            Verify the message is displayed on the feed
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.messageBtn.click();

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.messageFrame);
        nextbaseCrmProject.textMessageArea.sendKeys(faker.bothify("Hello-User-#####"));

        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.sendButton.click();
        BrowserUtils.sleep(1);

        Assert.assertTrue(nextbaseCrmProject.verifyTextMessage.isDisplayed());
        System.out.println(nextbaseCrmProject.verifyTextMessage.getText());
    }

       @Test (priority = 2)
       public void T1_helpdesk_verify_text_message() {

            nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
            nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
            BrowserUtils.sleep(1);
            nextbaseCrmProject.signInButton.click();

            nextbaseCrmProject.messageBtn.click();

            Driver.getDriver().switchTo().frame(nextbaseCrmProject.messageFrame);
            nextbaseCrmProject.textMessageArea.sendKeys(faker.bothify("Hello-Helpdesk-#####"));

            Driver.getDriver().switchTo().defaultContent();
            nextbaseCrmProject.sendButton.click();
            BrowserUtils.sleep(1);

            Assert.assertTrue(nextbaseCrmProject.verifyTextMessage.isDisplayed());
            System.out.println(nextbaseCrmProject.verifyTextMessage.getText());

        }

        @Test (priority = 3)
        public void T1_marketing_verify_text_message(){

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.messageBtn.click();

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.messageFrame);
        nextbaseCrmProject.textMessageArea.sendKeys(faker.bothify("Hello-Marketing-#####"));

        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.sendButton.click();
        BrowserUtils.sleep(1);

        Assert.assertTrue(nextbaseCrmProject.verifyTextMessage.isDisplayed());
        System.out.println(nextbaseCrmProject.verifyTextMessage.getText());
    }

    @Test (priority = 4)
    public void TC2_user_empty_messagebox_errorMsg() {

        /**
         * Test cases #2
         * Description:  Users see the warning message for the empty message body
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click the MESSAGE tab
         *     Users click the SEND button
         *            Verify “The message title is not specified” warning message is displayed on the page
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.messageBtn.click();
        nextbaseCrmProject.sendButton.click();

        Assert.assertEquals(nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText(),"The message title is not specified");
        System.out.println(nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText());
    }

    @Test (priority = 5)
    public void TC2_helpdesk_empty_messagebox_errorMsg() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.messageBtn.click();
        nextbaseCrmProject.sendButton.click();

        Assert.assertEquals(nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText(),"The message title is not specified");
        System.out.println(nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText());
    }

    @Test (priority = 6)
    public void TC2_marketing_empty_messagebox_errorMsg(){

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();

        nextbaseCrmProject.messageBtn.click();
        nextbaseCrmProject.sendButton.click();

        Assert.assertEquals(nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText(),"The message title is not specified");
        System.out.println(nextbaseCrmProject.emptyMessageSpaceErrorMsg.getText());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
