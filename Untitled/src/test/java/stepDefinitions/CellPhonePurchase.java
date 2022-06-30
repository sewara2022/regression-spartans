package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class CellPhonePurchase {
    @When("Customer adds cell phone to the cart")
    public void customer_adds_cell_phone_to_the_cart() {
        driver.findElement(By.cssSelector(".top-menu a[href=\"/electronics\"]")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/cell-phones\"]")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/smartphone\"]")).click();
        driver.findElement(By.cssSelector(".add-to-cart #add-to-cart-button-43")).click();


    }
}
