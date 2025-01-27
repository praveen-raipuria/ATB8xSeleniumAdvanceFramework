package com.thetestingacademy.Tests.vwoLogin.PageFactory_TestCase;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import com.thetestingacademy.utils.PropertiesReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_PF extends CommonToAllTest {
    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF.class);

    @Test
    public void testLoginNegativeVWO_PF() {

        logger.info("Starting the Testcases Page Factory");


        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("End of the Testcase!!");

        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));



    }
}

