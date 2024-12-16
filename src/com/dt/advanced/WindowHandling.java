package com.dt.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;



    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        String baseWindowHandle = driver.getWindowHandle();

        System.out.println(baseWindowHandle);

        driver.findElement(By.linkText("Open a popup window")).click();

        Set<String> winHandle = driver.getWindowHandles();

        for (String str : winHandle) {

            if (!str.equals(baseWindowHandle)) {

                driver.switchTo().window(str);

                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());

            }

        }


    }

}
