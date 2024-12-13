package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SingleSelectDropDown {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;
    static String loc_dropdown_docs = "select#drop1";


    public static void main(String[] args) throws InterruptedException {


        driver = new ChromeDriver();

        driver.get(appURL);
        driver.manage().window().maximize();

        Select sel = new Select(driver.findElement(By.cssSelector(loc_dropdown_docs)));

        // visibleText

         //  sel.selectByVisibleText("doc 4");
       // sel.selectByVisibleText("doc 3");

        //selectByValue

        //sel.selectByValue("def");
        //sel.selectByValue("mno");


        // selectbyIndex

        //sel.selectByIndex(1);
        //sel.selectByIndex(0);

        // System.out.println(sel.isMultiple());

     //   List<WebElement> availableOptions=sel.getOptions();

        //for(WebElement options:availableOptions) {

          //  System.out.println(options.getText());

        // }




    }

}
