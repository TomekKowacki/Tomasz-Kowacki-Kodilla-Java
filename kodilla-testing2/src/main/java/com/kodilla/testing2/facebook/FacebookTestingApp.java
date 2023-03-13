package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE_ACCEPT = "//button[@class=\"_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy\"]";
    public static final String XPATH_CREATE_BUTTON = "//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]";
    public static final String XPATH_WAIT = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_BD_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_BD_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_BD_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookieButton = driver.findElement(By.xpath(XPATH_COOKIE_ACCEPT));
        cookieButton.click();

        WebElement searchButton = driver.findElement(By.xpath(XPATH_CREATE_BUTTON));
        searchButton.click();

        while (!driver.findElement(By.xpath(XPATH_WAIT)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_BD_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByValue("26");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_BD_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(2);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_BD_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByVisibleText("1993");
    }
}
