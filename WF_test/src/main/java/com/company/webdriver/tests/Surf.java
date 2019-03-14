package com.company.webdriver.tests;

import com.company.webdriver.Base;
import org.openqa.selenium.WebDriver;

public class Surf extends Base {


    public void goToPage(WebDriver wd){
        wd.get("https://ancient-taiga-22967.herokuapp.com/");
        wd.manage().window().maximize();
        wd.manage().deleteAllCookies();
    }

}
