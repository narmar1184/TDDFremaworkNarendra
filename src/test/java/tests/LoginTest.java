package tests;

import base.BaseTest;
 

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.LoginPage;
import utilities.ExcelReader;
import utilities.LoggerManager;

import java.io.IOException;

public class LoginTest extends BaseTest {
	public  static final Logger logger = LoggerManager.getLogger(LoginTest.class);

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        return ExcelReader.getTestData("C:\\Users\\Dell\\eclipse-workspace1\\TDDframeworkSeleniumExample\\src\\test\\resources\\test_data.xlsx", "Sheet1");
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {
        driver.get("http://demo.guru99.com/V4/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        logger.info("First user enter");
       
        loginPage.enterPassword(password);
        
        loginPage.clickLogin();
       
        
      

        String expectedTitle = "Guru99 Bank Manager HomePage";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Login failed for user: " + username);
    }
}
