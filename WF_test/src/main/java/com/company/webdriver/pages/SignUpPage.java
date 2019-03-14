package com.company.webdriver.pages;

import org.openqa.selenium.By;

/**
 * @author M
 */
public class SignUpPage {
    private By nameField;
    private By emailField;
    private By passwordField;
    private By confirmPasswordField;
    private By signUpButton;
    private By signInLink;

    public By getNameField() {
        nameField = By.id("name");
        return nameField;
    }

    public By getEmailField() {
        emailField = By.id("email");
        return emailField;
    }

    public By getPasswordField() {
        passwordField = By.id("password");
        return passwordField;
    }

    public By getConfirmPasswordField() {
        confirmPasswordField = By.id("confirmationPassword");
        return confirmPasswordField;
    }

    public By getSignUpButton() {
        signUpButton = By.linkText(" Sign up");
        return signUpButton;
    }

    public By getSignInLink() {
        signInLink = By.linkText("Sign in here");
        return signInLink;
    }
}
