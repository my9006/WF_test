package com.company.webdriver.pages;
/**
 * @author M
 */

import org.openqa.selenium.By;

public class SignInPage {
    private By emailField;
    private By passwordField;
    private By signInButton;
    private By registerLink;

    public By getEmailField() {
        emailField= By.id("email");
        return emailField;
    }

    public By getPasswordField() {
        passwordField= By.id("password");
        return passwordField;
    }

    public By getSignInButton() {
        signInButton = By.xpath("//*[@id=\"loginForm\"]/fieldset/div[3]/button");
        return signInButton;
    }

    public By getRegisterLink() {
        registerLink = By.partialLinkText("Register here");
        return registerLink;
    }
}
