package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

    final static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get(appURL);

        // by id

        //  WebElement using_ID = driver.findElement(By.id("ta1"));
        //     using_ID.sendKeys("Using id Locator");
        // driver.findElement(By.id("ta1")).sendKeys("Using id Locator");

        // by name

        // WebElement using_Name = driver.findElement(By.name("userid"));
        // using_Name.sendKeys("using name locator");

        // by className

        //  WebElement using_ClassName = driver.findElement(By.className("title"));
        //  System.out.println(using_ClassName.getText());

        // by tagName

        WebElement using_tagName = driver.findElement(By.tagName("h3"));
        System.out.println(using_tagName.getText());

        //  WebElement using_LinkText = driver.findElement(By.linkText("Selenium143"));
        //  using_LinkText.click();

        // by partialLinkText

        // WebElement using_PartialLinkText = driver.findElement(By.partialLinkText("popup window"));
        // using_PartialLinkText.click();
    }

}
