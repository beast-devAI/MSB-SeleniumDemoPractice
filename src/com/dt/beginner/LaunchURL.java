package com.dt.beginner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {

    final static String appURL="https://omayo.blogspot.com/";

    public static void main(String[]args){

        WebDriver driver=new ChromeDriver();

        driver.get(appURL);

        String currentURL=driver.getCurrentUrl();

        System.out.println("Application URL shown is :"+" "+currentURL);

    }

}
