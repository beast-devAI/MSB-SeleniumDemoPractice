package com.dt.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    final static String appURL = "https://the-internet.herokuapp.com/nested_frames";
    static WebDriver driver;

    static String loc_frame_bottom = "frame[name='frame-bottom']";

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();


        driver.switchTo().frame(driver.findElement(By.cssSelector(loc_frame_bottom)));

        // System.out.println(driver.findElement(By.tagName("body")).getText());


        driver.switchTo()
                .parentFrame()
                .switchTo()
                .frame("frame-top")
                .switchTo()
                .frame("frame-middle")
                .switchTo().parentFrame()
                .switchTo().frame("frame-left");

        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent();

        System.out.println(driver.findElement(By.tagName("body")).getText());


    }
}