package com.selenium4_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunningCodeIncognitoMode {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Yogesh Tiwari");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println("Current URL is: "+driver.getCurrentUrl());
        System.out.println("Page title is: "+ driver.getTitle());
        driver.quit();
        

    }

}
