package tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTest;
import utilities.ConfigManager;
import utilities.LoggerManager;

public class LoginUITestusingProperties extends BaseTest{
	public  static final Logger logger = LoggerManager.getLogger(LoginUITestusingProperties.class);
	@Test
	public void testValidLogin() throws InterruptedException {
        logger.info("Starting valid login test...");
         driver.get(ConfigManager.getProperty("base.url"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername1();
        loginPage.enterPassword1();
       
       loginPage.clickLogin();

       // String expectedTitle = "Guru99 Bank Manager HomePage";
        //Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Guru99 Bank Manager HomePage");
        logger.info("Valid login test passed.");
    }

}
