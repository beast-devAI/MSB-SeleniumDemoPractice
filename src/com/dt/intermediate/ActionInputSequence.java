package com.dt.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionInputSequence {

    final static String appURL = "https://the-internet.herokuapp.com/key_presses";
    static WebDriver driver;
    static String loc_textArea_input="input#target";


    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement inputTarget=driver.findElement(By.cssSelector(loc_textArea_input));


        act.sendKeys(inputTarget,"This")
                .sendKeys(" ")
                .sendKeys("is")
                .sendKeys(" ")
                .sendKeys("ducat")
                .sendKeys(" ")
                 .sendKeys("institute ")
                .sendKeys(" ")
                .sendKeys("Software")
                .sendKeys(" ")
                .sendKeys("Testing")
                .build().perform();

    }

}
