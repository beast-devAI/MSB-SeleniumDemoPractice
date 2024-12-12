package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxHandling {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;
    static String loc_orange_chkBox = "input#checkbox1";
    static String loc_blue_chkBox = "input#checkbox2";
    static String loc_Base_ClrChkBox = "input[name='color']";
    static String getLoc_Base_AccessChkBox = "input[name='accessories']";

    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(appURL);
        driver.manage().window().maximize();
        // Thread.sleep(5000);
        // driver.findElement(By.cssSelector(loc_orange_chkBox)).click();
        //Thread.sleep(5000);
        //driver.findElement(By.cssSelector(loc_blue_chkBox)).click();


        //   List<WebElement> clrChkBoxElems = driver.findElements(By.cssSelector(loc_Base_ClrChkBox));

        // for (WebElement clrElems : clrChkBoxElems) {

        //   if(!clrElems.isSelected()) {
        //     clrElems.click();
        //   System.out.println("Item Clicked : " + clrElems.getAttribute("value"));
        //}
        //}

        List<WebElement> accesChkBoxElems = driver.findElements(By.cssSelector(getLoc_Base_AccessChkBox));

        for (WebElement accessElem : accesChkBoxElems) {

            if (!accessElem.isSelected()) {

                accessElem.click();
                System.out.println("Item Clicked : " + accessElem.getAttribute("value"));

            }
        }

    }


}
