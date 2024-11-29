package com.dt.beginner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

    final static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        Thread.sleep(5000);
        driver.get("https://www.automationexercise.com/");

        String pageTitle = driver.getTitle();

        System.out.println(pageTitle);
    }
}
