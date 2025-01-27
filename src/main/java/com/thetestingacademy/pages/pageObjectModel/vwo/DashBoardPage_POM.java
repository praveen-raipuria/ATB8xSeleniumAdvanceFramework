package com.thetestingacademy.pages.pageObjectModel.vwo;

import com.thetestingacademy.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage_POM extends CommonToAllPages {

    WebDriver driver;

    public DashBoardPage_POM(WebDriver driver) {
        this.driver = driver;
    }



    // Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }


}


