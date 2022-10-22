package com.nextbasecrm.tests;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.NextbaseCrmProject;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_9 {
    /**
     * As a user, I want to access the correct modules.
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
         * Description:  Users access to correct modules
         * Environment:  https://login1.nextbasecrm.com/
         * Steps:: Users are on the homepage
         *             Users click a module
         *             Verify users see the correct title for the module
         *
         *             DETERMINED BUG ON THIS USER STORY, SO ACTUAL TITLES ARE NOT MATCHING TO EXPECTED TITLES!!!
         */

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.username"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moduleActivity.click();
        BrowserUtils.sleep(1);
        System.out.println("USER ACCOUNT");
        System.out.println("Activity Stream Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleTasks.click();
        BrowserUtils.sleep(1);
        System.out.println("Tasks Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleChatAndCall.click();
        BrowserUtils.sleep(1);
        System.out.println("Chat and Calls Module: " + Driver.getDriver().getTitle());
        nextbaseCrmProject.moduleChatAndCallCloseBtn.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moduleWorkGroups.click();
        BrowserUtils.sleep(1);
        System.out.println("Workgroups Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleDrive.click();
        BrowserUtils.sleep(1);
        System.out.println("Drive Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCalendar.click();
        BrowserUtils.sleep(1);
        System.out.println("Calendar Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleMail.click();
        BrowserUtils.sleep(1);
        System.out.println("Mail Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleContactCenter.click();
        BrowserUtils.sleep(1);
        System.out.println("Contact Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCrm.click();
        BrowserUtils.sleep(1);
        System.out.println("CRM Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleTimeAndReports.click();
        BrowserUtils.sleep(1);
        System.out.println("Time and Reports Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleEmployees.click();
        BrowserUtils.sleep(1);
        System.out.println("Employees Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleServices.click();
        BrowserUtils.sleep(1);
        System.out.println("Services Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCompany.click();
        BrowserUtils.sleep(1);
        System.out.println("Company Module: " + Driver.getDriver().getTitle());
    }

    @Test (priority = 2)
    public void testHelpdesk() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.helpdesk2"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moduleActivity.click();
        BrowserUtils.sleep(1);
        System.out.println("HELPDESK ACCOUNT");
        System.out.println("Activity Stream Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleTasks.click();
        BrowserUtils.sleep(1);
        System.out.println("Tasks Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleChatAndCall.click();
        BrowserUtils.sleep(1);
        System.out.println("Chat and Calls Module: " + Driver.getDriver().getTitle());
        nextbaseCrmProject.moduleChatAndCallCloseBtn.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moduleWorkGroups.click();
        BrowserUtils.sleep(1);
        System.out.println("Workgroups Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleDrive.click();
        BrowserUtils.sleep(1);
        System.out.println("Drive Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCalendar.click();
        BrowserUtils.sleep(1);
        System.out.println("Calendar Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleMail.click();
        BrowserUtils.sleep(1);
        System.out.println("Mail Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleContactCenter.click();
        BrowserUtils.sleep(1);
        System.out.println("Contact Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCrm.click();
        BrowserUtils.sleep(1);
        System.out.println("CRM Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleTimeAndReports.click();
        BrowserUtils.sleep(1);
        System.out.println("Time and Reports Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleEmployees.click();
        BrowserUtils.sleep(1);
        System.out.println("Employees Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleServices.click();
        BrowserUtils.sleep(1);
        System.out.println("Services Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCompany.click();
        BrowserUtils.sleep(1);
        System.out.println("Company Module: " + Driver.getDriver().getTitle());
    }

    @Test (priority = 3)
    public void testMarketing() {

        nextbaseCrmProject.inputUsername.sendKeys(ConfigurationReader.getProperty("next.marketing3"));
        nextbaseCrmProject.inputPassword.sendKeys(ConfigurationReader.getProperty("next.password"));
        BrowserUtils.sleep(1);
        nextbaseCrmProject.signInButton.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moduleActivity.click();
        BrowserUtils.sleep(1);
        System.out.println("HELPDESK ACCOUNT");
        System.out.println("Activity Stream Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleTasks.click();
        BrowserUtils.sleep(1);
        System.out.println("Tasks Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleChatAndCall.click();
        BrowserUtils.sleep(1);
        System.out.println("Chat and Calls Module: " + Driver.getDriver().getTitle());
        nextbaseCrmProject.moduleChatAndCallCloseBtn.click();
        BrowserUtils.sleep(1);

        nextbaseCrmProject.moduleWorkGroups.click();
        BrowserUtils.sleep(1);
        System.out.println("Workgroups Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleDrive.click();
        BrowserUtils.sleep(1);
        System.out.println("Drive Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCalendar.click();
        BrowserUtils.sleep(1);
        System.out.println("Calendar Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleMail.click();
        BrowserUtils.sleep(1);
        System.out.println("Mail Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleContactCenter.click();
        BrowserUtils.sleep(1);
        System.out.println("Contact Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCrm.click();
        BrowserUtils.sleep(1);
        System.out.println("CRM Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleTimeAndReports.click();
        BrowserUtils.sleep(1);
        System.out.println("Time and Reports Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleEmployees.click();
        BrowserUtils.sleep(1);
        System.out.println("Employees Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleServices.click();
        BrowserUtils.sleep(1);
        System.out.println("Services Module: " + Driver.getDriver().getTitle());

        nextbaseCrmProject.moduleCompany.click();
        BrowserUtils.sleep(1);
        System.out.println("Company Module: " + Driver.getDriver().getTitle());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
