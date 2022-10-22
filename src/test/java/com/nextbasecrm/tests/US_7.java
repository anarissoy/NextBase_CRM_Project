package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class US_7 {
    /**
     * As a user, I want to vote for a poll with one answer.
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
         * Description:  Users vote polls successfully
         * Environment:  https://login1.nextbasecrm.com/
         * Pre-Condition: There should be at least one poll is listed on the feed
         * Steps: Users are on the homepage
         *            Users click one answer for a poll
         *            Users click the VOTE button
         *             Verify one option is selected / user voted
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.pollButton.click();
        BrowserUtils.sleep(1);
        //Driver.getDriver().findElement(By.xpath("//*[@id='feed-add-post-form-tab-vote']")).click();

        Driver.getDriver().switchTo().frame(nextbaseCrmProject.pollMessageFrame);
        //Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe")));

        BrowserUtils.sleep(1);
        nextbaseCrmProject.pollMainTextArea.sendKeys(faker.bothify("What do you think-###"));
        //Driver.getDriver().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys(faker.bothify("What do you think?-###"));
        Driver.getDriver().switchTo().defaultContent();

        nextbaseCrmProject.pollQuestionInput.sendKeys(faker.bothify("What do you think-###"));
        //Driver.getDriver().findElement(By.xpath("//input[@id='question_0']")).sendKeys(faker.bothify("What do you think?-###"));

        nextbaseCrmProject.pollAnswerInput1.sendKeys(faker.bothify("everything-###"));
        //Driver.getDriver().findElement(By.xpath("//input[@id='answer_0__0_']")).sendKeys(faker.bothify("everything-###"));

        nextbaseCrmProject.pollAnswerInput2.sendKeys(faker.bothify("nothing-###"));
        //Driver.getDriver().findElement(By.xpath("//input[@id='answer_0__1_']")).sendKeys(faker.bothify("nothing-###"));

        nextbaseCrmProject.pollSendBtn.click();
        //Driver.getDriver().findElement(By.xpath("//*[@id='blog-submit-button-save']")).click();

        List<WebElement> voting = nextbaseCrmProject.pollRadioBtn;
        //List<WebElement> voting = Driver.getDriver().findElements((By) nextbaseCrmProject.pollSendBtn);//findElements(By.xpath("(//span[@class='bx-vote-block-inp-substitute'])[1]"));
        for (int i = 1; i <= 2; i++) {
            BrowserUtils.sleep(2);
            voting.get(0).click();
            BrowserUtils.sleep(2);
        }

        nextbaseCrmProject.pollVoteBtn.click();
        //Driver.getDriver().findElement(By.xpath("//button[.='Vote']")).click();
        BrowserUtils.sleep(1);

        WebElement verify = nextbaseCrmProject.pollVoteVerify;//Driver.getDriver().findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-link']"));

        Assert.assertTrue(verify.isDisplayed());
        System.out.println(verify.isDisplayed());
    }

    @Test (priority = 2)
    public void testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);
        nextbaseCrmProject.pollButton.click();
        BrowserUtils.sleep(1);
        Driver.getDriver().switchTo().frame(nextbaseCrmProject.pollMessageFrame);
        BrowserUtils.sleep(1);
        nextbaseCrmProject.pollMainTextArea.sendKeys(faker.bothify("What do you think-###"));
        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.pollQuestionInput.sendKeys(faker.bothify("What do you think-###"));
        nextbaseCrmProject.pollAnswerInput1.sendKeys(faker.bothify("everything-###"));
        nextbaseCrmProject.pollAnswerInput2.sendKeys(faker.bothify("nothing-###"));
        nextbaseCrmProject.pollSendBtn.click();
        List<WebElement> voting = nextbaseCrmProject.pollRadioBtn;
        for (int i = 1; i <= 2; i++) {
            BrowserUtils.sleep(2);
            voting.get(0).click();
            BrowserUtils.sleep(2);
        }
        nextbaseCrmProject.pollVoteBtn.click();
        BrowserUtils.sleep(1);
        WebElement verify = nextbaseCrmProject.pollVoteVerify;

        Assert.assertTrue(verify.isDisplayed());
        System.out.println(verify.isDisplayed());
    }

    @Test (priority = 3)
    public void testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);
        nextbaseCrmProject.pollButton.click();
        BrowserUtils.sleep(1);
        Driver.getDriver().switchTo().frame(nextbaseCrmProject.pollMessageFrame);
        BrowserUtils.sleep(1);
        nextbaseCrmProject.pollMainTextArea.sendKeys(faker.bothify("What do you think-###"));
        Driver.getDriver().switchTo().defaultContent();
        nextbaseCrmProject.pollQuestionInput.sendKeys(faker.bothify("What do you think-###"));
        nextbaseCrmProject.pollAnswerInput1.sendKeys(faker.bothify("everything-###"));
        nextbaseCrmProject.pollAnswerInput2.sendKeys(faker.bothify("nothing-###"));
        nextbaseCrmProject.pollSendBtn.click();
        List<WebElement> voting = nextbaseCrmProject.pollRadioBtn;
        for (int i = 1; i <= 2; i++) {
            BrowserUtils.sleep(2);
            voting.get(0).click();
            BrowserUtils.sleep(2);
        }
        nextbaseCrmProject.pollVoteBtn.click();
        BrowserUtils.sleep(1);
        WebElement verify = nextbaseCrmProject.pollVoteVerify;

        Assert.assertTrue(verify.isDisplayed());
        System.out.println(verify.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}