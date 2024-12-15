package com.dt.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

    final static String appURL = "https://the-internet.herokuapp.com/key_presses";
    static WebDriver driver;
    static String loc_textArea_input="input#target";


    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement inputTarget=driver.findElement(By.cssSelector(loc_textArea_input));

    /*    act.click(inputTarget).keyDown(Keys.NUMPAD0)
                .keyDown(Keys.NUMPAD8)
                .keyDown(Keys.SPACE)
                .keyDown(Keys.NUMPAD0)
                .keyDown(Keys.NUMPAD4)
                .keyDown(Keys.SPACE)
                .keyDown(Keys.NUMPAD2)
                .keyDown(Keys.NUMPAD0)
                .keyDown(Keys.NUMPAD0)
                .keyDown(Keys.NUMPAD3)
                .build()
                .perform();
 */

        act.click(inputTarget)
                .keyDown(Keys.SHIFT)
                .sendKeys("hi")
                .sendKeys(" ")
                .sendKeys("my birthday")
                .sendKeys(" ")
                .keyUp(Keys.SHIFT)
                .sendKeys("on")
                .sendKeys(" ")
                .sendKeys("eleven Aug")
                .sendKeys(" ")
                .sendKeys("two Thousand Ten")
                .build()
                .perform();

    }

}