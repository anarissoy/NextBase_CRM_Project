package com.nextbasecrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRM_Utilities {
    /*
    1. Create a new method for login
2. Create a method to make Task3 logic re-usable
3. When method is called, it should simply login

This method should have at least 2 overloaded versions.

Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver


Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password
     */

    public static void login_crm(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("hr2@cydeo.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();

    }

    public static void login_crm2(WebDriver driver, String username, String password){
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();

    }
}
