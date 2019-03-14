package com.company.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Base {

    public static WebDriver getCh_wd() {
        Scanner chromeDriverPathScanner = new Scanner(System.in);
        System.out.println("Please past the path of the chromedriver");
        String chromeDriverPath = chromeDriverPathScanner.nextLine().replace('\\', '/');
        System.setProperty("webdriver.chrome.driver", chromeDriverPath+ "/chromedriver.exe");
        WebDriver ch_wd = new ChromeDriver();
        return ch_wd;
    }
}
