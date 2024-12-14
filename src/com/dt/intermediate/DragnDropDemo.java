package com.dt.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragnDropDemo {

    final static String appURL = "https://the-internet.herokuapp.com/drag_and_drop";
    static WebDriver driver;
    static String loc_dragDrop_A = "div#column-a";
    static String loc_dragDrop_B = "div#column-b";

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement tile_A=driver.findElement(By.cssSelector(loc_dragDrop_A));
        WebElement tile_B=driver.findElement(By.cssSelector(loc_dragDrop_B));


        act.dragAndDrop(tile_A,tile_B)
                .dragAndDrop(tile_B,tile_A)
                .dragAndDrop(tile_A,tile_B)
                   .build().perform();



    }

}
