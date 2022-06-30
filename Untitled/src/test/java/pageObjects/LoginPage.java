package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static stepDefinitions.TestSuiteSetUp.driver;

public class LoginPage {

    public String demoShopLink = "http://demowebshop.tricentis.com";
    public String username = "qwerty2245@abc.com";
    public String pwd = "123456";

    public By logInLocator = By.className("ico-login");
    public By emailLocator = By.id("Email");
    public By passwordLocator = By.id("Password");
    public By logOutLocator = By.className("ico-logout");


    public void logIn(){
        driver.findElement(logInLocator).click();
        driver.findElement(emailLocator).sendKeys(username, Keys.ENTER);
        driver.findElement(passwordLocator).sendKeys(pwd, Keys.ENTER);
    }

    public void with(String username, String password){
        driver.findElement(logInLocator).click();
        driver.findElement(emailLocator).sendKeys(username, Keys.ENTER);
        driver.findElement(passwordLocator).sendKeys(password, Keys.ENTER);
    }


}
