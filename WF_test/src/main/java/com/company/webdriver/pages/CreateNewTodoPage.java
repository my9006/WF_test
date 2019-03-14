package com.company.webdriver.pages;

import org.openqa.selenium.By;

public class CreateNewTodoPage {
    private By titleField;
    private By dueDateField;
    private By priorityDropDown;
    private By createButton;
    private By cancelButton;
    private By monthList;
    private By month;
    private By date;

    public By getTitleField() {
        titleField = By.id("title");
        return titleField;
    }

    public By getDueDateField() {
        dueDateField = By.id("dueDate");
        return dueDateField;
    }

    public By getPriorityDropDown() {
        priorityDropDown= By.id("priority");
        return priorityDropDown;
    }

    public By getCreateButton() {
        createButton = By.xpath("//*[@id=\"createTodoForm\"]/fieldset/div[4]/button[1]");
        return createButton;
    }

    public By getCancelButton() {
        cancelButton = By.xpath("//*[@id=\"createTodoForm\"]/fieldset/div[4]/button[2]");
        return cancelButton;
    }

    public By getMonthList() {
        monthList = By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[2]");
        return monthList;
    }

    public By getMonth() {
        month = By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span[5]");
        return month;
    }

    public By getDate() {
        date = By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[3]");
        return date;
    }
}
