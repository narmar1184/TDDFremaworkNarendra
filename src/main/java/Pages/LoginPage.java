package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigManager;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By usernameField = By.name("uid");
    private By passwordField = By.name("password");
    private By loginButton = By.name("btnLogin");

    // Constructor
    public  LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public void enterUsername(String username ) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword( String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    public void enterUsername1() {
        driver.findElement(usernameField).sendKeys(ConfigManager.getProperty("valid.username"));
    }
    public void enterPassword1() {
        driver.findElement(passwordField).sendKeys(ConfigManager.getProperty("valid.password"));
    }
}
