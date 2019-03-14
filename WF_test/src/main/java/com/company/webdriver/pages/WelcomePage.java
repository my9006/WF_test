package com.company.webdriver.pages;

import com.company.webdriver.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage extends Base {

    private By signInButton;
    private By signUpButton;

    public By getSignInButton() {
        signInButton = By.xpath("/html/body/div[2]/div/div/div/div[1]/p[3]/a[1]");
        return signInButton;
    }

    public By getSignUpButton() {
        signUpButton = By.xpath("/html/body/div[2]/div/div/div/div[1]/p[3]/a[2]");
        return signUpButton;
    }

    public void goToPage(){
        WebDriver wd = getCh_wd();
        String path ="https://ancient-taiga-22967.herokuapp.com/index";
        wd.get(path);
        wd.manage().window().maximize();
        wd.manage().deleteAllCookies();
        wd.getCurrentUrl();
        if(!wd.getCurrentUrl().equals(path)){
            System.out.println("The address was redirected, SECURITY ISSUE");
        }
        wd.findElement(getSignInButton()).click();

    }

}
