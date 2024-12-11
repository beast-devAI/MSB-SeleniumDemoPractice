package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonHandling {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;
    static String loc_Male_RadioBtn = "input#radio1";
    static String loc_Female_RadioBtn = "input#radio2";
    static String loc_base_gender = "input[name='gender']";
    static String loc_base_vehicle = "input[name='vehicle']";

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get(appURL);

        driver.manage().window().maximize();

        //   driver.findElement(By.cssSelector(loc_Male_RadioBtn)).click();
        //  Thread.sleep(5000);
        // driver.findElement(By.cssSelector(loc_Female_RadioBtn)).click();

        //   List<WebElement> radioGenderBtnElem = driver.findElements(By.cssSelector(loc_base_gender));

//
        //      for (WebElement genElm : radioGenderBtnElem) {
//
        //        Thread.sleep(5000);
        //      genElm.click();

        // }


        List<WebElement> radioVehiclBtnElem = driver.findElements(By.cssSelector(loc_base_vehicle));

        for (WebElement vhElem : radioVehiclBtnElem) {

            if (!vhElem.isSelected()) {

                Thread.sleep(5000);
                vhElem.click();
                System.out.println("Selected radio button is : "+vhElem.getAttribute("value"));
            }
        }

    }

}
