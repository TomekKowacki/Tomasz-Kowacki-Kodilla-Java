package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {

    public final static String CHROME = "CHROME_DRIVER";
    public static WebDriver getDriver(final String driver) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        if (driver.equals(CHROME)) {
            return new ChromeDriver(options);
        } else {
            return null;
        }
    }
}
