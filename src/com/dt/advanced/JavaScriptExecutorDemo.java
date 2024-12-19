package com.dt.advanced;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

    final static String appURL = "https://www.bigbasket.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        JavascriptExecutor jsDemo = (JavascriptExecutor) driver;

        String script = "window.scrollBy(0,document.body.scrollHeight)";
        String scriptAlert = "alert('This is my JS demo');";
        jsDemo.executeScript(script);
        jsDemo.executeScript(scriptAlert);


    }

}
