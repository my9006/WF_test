package com.company.webdriver.pages;

import org.openqa.selenium.By;

public class HomePage {
    private By homeLink;
    private By myAccount;
    private By createTodo;
    private By searchBar;
    private By goButton;

    public By getHomeLink() {
        homeLink = By.xpath("/html/body/div[2]/div/div[1]/div/ul/li[2]/a");
        return homeLink;
    }

    public By getMyAccount() {
        myAccount = By.xpath("/html/body/div[2]/div/div[1]/div/ul/li[3]/a");
        return myAccount;
    }

    public By getCreateTodo() {
        createTodo = By.xpath("/html/body/div[2]/div/div[1]/div/ul/li[4]/a");
        return createTodo;
    }

    public By getSearchBar() {
        searchBar = By.xpath("//*[@id=\"searchForm\"]/div/input");
        return searchBar;
    }

    public By getGoButton() {
        goButton = By.xpath("//*[@id=\"searchForm\"]/div/button");
        return goButton;
    }


}
