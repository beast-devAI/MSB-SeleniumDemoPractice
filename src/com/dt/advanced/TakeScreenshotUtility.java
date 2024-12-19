package com.dt.advanced;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotUtility {
    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;
    static String screenShotPath = "Screenshot/test.png";

    public static void main(String[] args) throws InterruptedException, IOException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(screenShotPath);
        FileUtils.copyFile(src, dest);


    }

}
