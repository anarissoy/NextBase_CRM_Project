package com.nextbasecrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetEmailUtils {
    /*
    TC #3: Create a custom method
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/tables
3- Write custom method:

• Method name: getTableGetEmail()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String tableNum
• Arg3: String firstName
     */

    public static void getTableGetEmail(WebDriver driver, String tableNum, String firstName){

        String locator = "//table[@id='"+tableNum+"']//td[.='"+firstName + "']//following-sibling::td[1]";
        //String locator = "//tbody//td[.='Smith']//following-sibling::td[2]";

        WebElement getEmail = driver.findElement(By.xpath(locator));

        System.out.println(getEmail.getText());

    }



}
