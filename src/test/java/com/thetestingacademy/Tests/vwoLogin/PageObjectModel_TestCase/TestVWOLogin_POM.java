package com.thetestingacademy.Tests.vwoLogin.PageObjectModel_TestCase;

import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageObjectModel.vwo.DashBoardPage_POM;
import com.thetestingacademy.pages.pageObjectModel.vwo.LoginPage_POM;
import com.thetestingacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_POM {
    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO() {

        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver());
        String error_msg = loginPagePom.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));


    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPositive() {

        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver());
        loginPagePom.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashBoardPage_POM dashboardPagePom = new DashBoardPage_POM(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("expected_username"));


    }



}

