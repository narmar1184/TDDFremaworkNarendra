package base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseTest {
	public  WebDriver driver;
    @BeforeMethod
    public void setUp() {
    	 driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
