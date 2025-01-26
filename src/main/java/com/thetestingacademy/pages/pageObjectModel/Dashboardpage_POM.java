package com.thetestingacademy.pages.pageObjectModel.orangehr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.thetestingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage_POM_OHR  extends CommonToAllPage{

    WebDriver driver;

    public DashBoardPage_POM_OHR(WebDriver driver) {
        this.driver = driver;
    }



    // Page Locators
    By userNameOnDashboard = By.xpath("//h6[normalize-space()='PIM']");


    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }}

