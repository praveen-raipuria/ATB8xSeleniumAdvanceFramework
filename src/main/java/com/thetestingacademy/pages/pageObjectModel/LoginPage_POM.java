package com.thetestingacademy.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM{

WebDriver driver;
    public LoginPage_POM(WebDriver driver) {
this.driver=driver;
    }


    // page locators
    private By username = By.id("login-username");
    private By Password=By.id("Login-password");
    private By SignButton=By.id("js-login-btn");
    private By error_messages=By.id("js-notification-box-msg");

//If you are not using it,dont keep.

    // page actions

    public String loginVWOLoginInvalidCreds(String user, String pwd) {
        driver.findElement(username);sendkeys(user);
        driver.findElement(Password);sendkeys(pwd);
        driver.findElement(SignButton).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String error_message_text=driver.findElement(error_messages).getText();
        return error_message_text;
    }}






