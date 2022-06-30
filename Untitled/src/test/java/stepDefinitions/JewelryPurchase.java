package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.LoginPage;

import static stepDefinitions.TestSuiteSetUp.driver;

public class JewelryPurchase {
    LoginPage loginPage = new LoginPage();
    @When("Customer adds jewelry to the cart")
    public void customer_adds_jewelry_to_the_cart() {
        driver.findElement(By.partialLinkText("Jewelry")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/black-white-diamond-heart\"]")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button-14")).click();

    }

    @When("Customer logs in")
    public void user_logs_in() {
        loginPage.logIn();
    }
}
