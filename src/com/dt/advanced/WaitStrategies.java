package com.dt.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitStrategies {

    final static String appURL = "https://omayo.blogspot.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {

        driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        // driver.findElement(By.cssSelector("test")).sendKeys("Test wait data");

        driver.findElement(By.cssSelector("button.dropbtn")).click();
        // driver.findElements(By.cssSelector("div#myDropdown>a")).get(2).click();

       /* //Explicit Wait

        WebElement gmailElem=driver.findElements(By.cssSelector("div#myDropdown>a")).get(2);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(gmailElem)).click();
     */

        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(Exception.class);
        fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("input[id='dte']"));
            }
        }).click();
    }
}
