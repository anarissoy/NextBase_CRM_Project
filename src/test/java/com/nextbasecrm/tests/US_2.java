package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_2 {
    /**
     * As a user, I should be able to save my user credential on a computer.
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
    public void rememberMeVerify() {
        /**
         * AC:
         * 1.“Remember me on this computer” should be displayed on the right side of the checkbox label.
         *
         * Test cases #1
         * Description:  check the “Remember me” checkbox
         *
         * Steps:: Users go to the login page
         *             Verify there is a “Remember me on this computer” message displayed
         */

        nextbaseCrmProject.checkRememberBox.click();
        nextbaseCrmProject.rememberMeOnThisComputerMsg.isDisplayed();
        Assert.assertEquals(nextbaseCrmProject.rememberMeOnThisComputerMsg.getText(),"Remember me on this computer","FAILED!");
    }
}
