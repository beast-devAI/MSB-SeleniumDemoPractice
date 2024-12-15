package com.dt.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

    final static String appURL_Omayo = "https://omayo.blogspot.com/";
    static WebDriver driver;
    static String loc_btn_doubleClick ="div#HTML46 button";
    static String loc_Menu_blogsMenu = "span#blogsmenu";
    static String loc_blogs_subMenu="//span[contains(text(),'Selenium143')]";
    static String loc_img_omayo="div#HTML29 img";
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL_Omayo);
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement inputTarget = driver.findElement(By.cssSelector(loc_btn_doubleClick));
        WebElement blogMenuElement=driver.findElement(By.cssSelector(loc_Menu_blogsMenu));
        WebElement blogSubMenuElement=driver.findElement(By.xpath(loc_blogs_subMenu));
        WebElement image_Element=driver.findElement(By.cssSelector(loc_img_omayo));

        // act.doubleClick(inputTarget).build().perform();

      //  act.moveToElement(blogMenuElement)
        //       .click()
          //     .moveToElement(blogSubMenuElement)
            //    .click()
              //  .build().perform();

        // act.contextClick().build().perform();

        act.contextClick(image_Element).build().perform();


    }
}
