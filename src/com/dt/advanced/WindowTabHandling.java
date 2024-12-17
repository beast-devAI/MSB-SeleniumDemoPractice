package com.dt.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class WindowTabHandling {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        String baseWinHandle = driver.getWindowHandle();

        System.out.println("Base Window handle: " + baseWinHandle);

        driver.findElement(By.linkText("SeleniumTutorial")).click();
        //  driver.findElement(By.linkText("SeleniumTutorial")).click();
/*
        new Actions(driver)
                .click(driver.findElement(By.linkText("SeleniumTutorial")))
                .click(driver.findElement(By.linkText("SeleniumTutorial")))
                .click(driver.findElement(By.linkText("SeleniumTutorial")))
                .build()
                .perform();
*/

        Set<String> totalWindows = driver.getWindowHandles();
        System.out.println("Total tab open :" + "" + totalWindows.size());

        for (String winHandle : totalWindows) {
            if (!winHandle.equals(baseWinHandle)) {
                driver.switchTo().window(winHandle);
                System.out.println(driver.getCurrentUrl());
                System.out.println(driver.getTitle());
                driver.findElements(By.cssSelector("td>a")).get(1).click();
                Thread.sleep(5000);
                driver.close();


            }


        }


    }
}