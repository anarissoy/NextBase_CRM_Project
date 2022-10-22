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

public class US_1 {
    /**
     * As a user, I should be able to log in to the NextBaseCRM.
     */
    NextbaseCrmProject nextbaseCrmProject;
    Faker faker;


    @BeforeMethod
    public void setUp(){
        nextbaseCrmProject = new NextbaseCrmProject();
        faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }

    @Test (priority = 1)
    public void valid_login_test(){
        /**
         * Test cases #1
         * Description:  Successful login
         * Environment:  https://login2.nextbasecrm.com/
         * Steps:: Users go to the login page
         *             Enter valid emails and passwords
         *             Click the Login In button
         *             Verify users log in successfully and launch the homepage
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(2);
        nextbaseCrmProject.signInButton.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }

    @Test (priority = 2)
    public void invalid_login_test(){
        /**
         * Test cases #2
         * Description:  User login with invalid credentials
         * Environment:  https://login1.nextbasecrm.com/
         * Steps::  Users go to the login page
         *              Enter an invalid email or password
         *              Click the Login In button
         *              Verify users see “Incorrect username or password” on the page
         */

        nextbaseCrmProject.inputUsername.sendKeys(faker.internet().emailAddress().replace(".",""));
        nextbaseCrmProject.inputPassword.sendKeys(faker.internet().password());
        nextbaseCrmProject.signInButton.click();
        Assert.assertEquals(nextbaseCrmProject.incorrectLoginOrPasswordMsg.getText(),"Incorrect login or password","FAILED");

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
