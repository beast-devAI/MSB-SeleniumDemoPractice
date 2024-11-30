package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAreaBoxHandling {

    final static String appURL = "https://omayo.blogspot.com/";

    static String locator_TextArea = "ta1";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get(appURL);

        WebElement textAreElement = driver.findElement(By.id(locator_TextArea));

        //  locator_TextArea.click(); [We need web element not the locator itself]
        textAreElement.sendKeys("Hi Selenium Demo");


    }

}