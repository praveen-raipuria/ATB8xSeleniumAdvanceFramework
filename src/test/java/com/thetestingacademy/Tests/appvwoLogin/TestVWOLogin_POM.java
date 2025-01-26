package com.thetestingacademy.Tests.appvwoLogin;

import com.thetestingacademy.pages.pageObjectModel.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_POM {

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO() {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");

        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg = loginPagePom.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));


    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPositive() {



    }



}

