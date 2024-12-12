package com.dt.beginner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    final static String appURL = "https://the-internet.herokuapp.com/javascript_alerts";
    static WebDriver driver;
    static String btn_JS_alert = "//button[text()='Click for JS Alert']";
    static String btn_JS_confirm = "//button[text()='Click for JS Confirm']";
    static String btn_JS_prompt = "//button[text()='Click for JS Prompt']";


    public static void main(String[] args) throws InterruptedException {


        driver = new ChromeDriver();

        driver.get(appURL);
        driver.manage().window().maximize();

        // driver.findElement(By.xpath(btn_JS_alert)).click();

        //Alert al= driver.switchTo().alert();

        //al.accept();
        // al.dismiss();

        // driver.findElement(By.xpath(btn_JS_confirm)).click();

        // Alert al= driver.switchTo().alert();

        //  System.out.println(al.getText());

        //   al.accept();

        //  al.dismiss();

        driver.findElement(By.xpath(btn_JS_prompt)).click();

        Alert al = driver.switchTo().alert();

        System.out.println(al.getText());

        al.sendKeys("This is JS Prompt Demo By Ank");

        // al.accept();
        al.dismiss();

    }
}