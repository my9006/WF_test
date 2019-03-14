package com.company.webdriver.tests;

import com.company.webdriver.Base;
import com.company.webdriver.pages.CreateNewTodoPage;
import com.company.webdriver.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskCreationTest extends Base {
    private WebDriver wd;
    private HomePage hp;
    private CreateNewTodoPage td;


    public void createTodo(WebDriver wd) {
        hp = new HomePage();
        wd.findElement(hp.getCreateTodo()).click();

        td = new CreateNewTodoPage();
        wd.findElement(td.getTitleField()).sendKeys("Celebrate!!!");

        wd.findElement(td.getDueDateField()).click();
        wd.findElement(td.getMonthList()).click();
        wd.findElement(td.getMonth()).click();
        wd.findElement(td.getDate()).click();

        Select priorityDropDown = new Select(wd.findElement(td.getPriorityDropDown()));
        priorityDropDown.selectByIndex(2);

        wd.findElement(td.getCreateButton()).click();

    }
}
