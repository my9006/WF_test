package com.company.webdriver.tests;

import com.company.webdriver.Base;
import com.company.webdriver.pages.SignInPage;
import com.company.webdriver.pages.WelcomePage;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class LoginTest {

//    private WebDriver wd;
    private Surf surf;
    private SignInPage sp;
    private WelcomePage wp;
    private Scanner emailScanner;
    private Scanner passwordScanner;

    public void logIn(WebDriver wd){
        surf = new Surf();
        surf.goToPage(wd);
        wp = new WelcomePage();
        wd.findElement(wp.getSignInButton()).click();
        sp = new SignInPage();

        emailScanner = new Scanner(System.in);
        System.out.println("***********************"+"Please enter valid, registered email"+"***********************");
        wd.findElement(sp.getEmailField()).sendKeys(emailScanner.nextLine());

        passwordScanner = new Scanner(System.in);
        System.out.println("***********************"+"Please enter the password"+"***********************");
        wd.findElement(sp.getPasswordField()).sendKeys(passwordScanner.nextLine());
        wd.findElement(sp.getSignInButton()).click();
    }

}
