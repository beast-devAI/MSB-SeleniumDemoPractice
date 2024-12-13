package com.dt.beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalBasedPopup {

    final static String appURL = "https://practice-automation.com/modals/";
    static WebDriver driver;
    static String loc_btn_FormModal = "button#formModal";
    static String loc_name_txtField_formModal = "input[id$=name]";
    static String loc_email_txtField_formModal = "input[id$='email']";
    static String loc_message_txtField_formModal = "textarea[id$='message']";
    static String loc_btn_submit_formModal ="button[class='pushbutton-wide']";


    public static void main(String[] args) throws InterruptedException {


        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(loc_btn_FormModal)).click();
        driver.findElement(By.cssSelector(loc_name_txtField_formModal)).sendKeys("MSB");
        driver.findElement(By.cssSelector(loc_email_txtField_formModal)).sendKeys("test@test.com");
        driver.findElement(By.cssSelector(loc_message_txtField_formModal)).sendKeys("This is modal popup message");
        Thread.sleep(8000);
        driver.findElement(By.cssSelector(loc_btn_submit_formModal)).click();


    }
}