package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;

import static stepDefinitions.TestSuiteSetUp.driver;



import static org.junit.Assert.assertTrue;

public class LogIn {

    LoginPage loginPage = new LoginPage();

    @Given("I have chosen to login")
    public void i_have_chosen_to_login() {
        driver.get(loginPage.demoShopLink);
//       Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ico-login")));
        driver.findElement(loginPage.logInLocator).click();
    }

    //Positive
    @When("I provide valid details")
    public void i_provide_valid_details() {
        driver.findElement(loginPage.emailLocator).sendKeys(loginPage.username, Keys.ENTER);
        driver.findElement(loginPage.passwordLocator).sendKeys(loginPage.pwd, Keys.ENTER);
    }

    @Then("I should see logout button")
    public void i_should_see_logout_button() throws InterruptedException {
        Thread.sleep(1000);
        boolean isLogout = driver.findElement(loginPage.logOutLocator).isDisplayed();
        assertTrue(isLogout);
    }

    //Negative
    @When("I provide invalid password")
    public void i_provide_invalid_password() {
        driver.findElement(By.id("Email")).sendKeys("qwerty2245@abc.com", Keys.ENTER);
        driver.findElement(By.id("Password")).sendKeys("123456qw", Keys.ENTER);

    }
    @Then("I should see forgot password link")
    public void i_should_see_forgot_password_link() {
        boolean forgotPassword = driver.findElement(By.className("forgot-password")).isDisplayed();
        assertTrue(forgotPassword);
    }

    @Then("Take a screenshot")
    public void take_a_screenshot() throws Exception {
        Utility.testTakesScreenshot();
    }


}
