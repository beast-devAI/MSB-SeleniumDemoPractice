package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdown {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;
    static String loc_dropdown_cars = "select#multiselect1";


    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        Select sel = new Select(driver.findElement(By.cssSelector(loc_dropdown_cars)));

        System.out.println(sel.isMultiple());

        // sel.selectByVisibleText("Audi");

        // sel.selectByVisibleText("Swift");

        // sel.selectByIndex(0);
        // sel.selectByIndex(2);

       // sel.selectByValue("audix");
       // sel.selectByValue("volvox");


        sel.selectByIndex(0);
       // sel.selectByIndex(1);
        sel.selectByIndex(2);
        sel.selectByIndex(3);

        // sel.deselectAll();

        // sel.deselectByIndex(2);

       List<WebElement> selectedOptions= sel.getAllSelectedOptions();

       for(WebElement options:selectedOptions) {

           System.out.println(options.getText());
       }



    }
}
