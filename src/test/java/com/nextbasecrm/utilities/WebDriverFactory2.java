package com.nextbasecrm.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory2 {

    public static WebDriver getDriver(String browserName){
        WebDriver driver;

        switch (browserName.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            default:
                System.out.println("Unknown Browser Type " + browserName);
                driver = null;
        }

        driver.manage().window().maximize();
        return driver;
    }
}
