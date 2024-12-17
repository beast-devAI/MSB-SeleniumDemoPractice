package com.dt.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableHandling {


    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;

    static String loc_tableRow = "table#table1 tbody tr";
    static String loc_tableCell = "table#table1 tbody tr td";

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.cssSelector(loc_tableRow));
        List<WebElement> cell = driver.findElements(By.cssSelector(loc_tableCell));

        for (WebElement rowElems : rows) {

            for (WebElement cellData : rowElems.findElements(By.cssSelector(loc_tableCell))) {

                System.out.print(cellData.getText() + "\t");

            }
            System.out.println();
        }


    }
}