package com.company;

import com.company.webdriver.Base;
import com.company.webdriver.pages.WelcomePage;
import com.company.webdriver.tests.LoginTest;
import com.company.webdriver.tests.TaskCreationTest;
import org.openqa.selenium.WebDriver;


/**
 * @author M
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        WebDriver wd = Base.getCh_wd();

        LoginTest lt = new LoginTest();
        lt.logIn(wd);

        TaskCreationTest tck = new TaskCreationTest();
        tck.createTodo(wd);

    }
}
