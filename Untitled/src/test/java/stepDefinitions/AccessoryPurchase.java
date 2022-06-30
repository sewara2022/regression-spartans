package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class AccessoryPurchase {
    @When("Customer adds accessory to the cart")
    public void customer_adds_accessory_to_the_cart() {
        driver.findElement(By.cssSelector(".top-menu a[href=\"/computers\"]")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/accessories\"]")).click();
        driver.findElement(By.partialLinkText("TCP Instructor Led Training")).click();
        driver.findElement(By.cssSelector(".add-to-cart-panel #add-to-cart-button-66")).click();

    }
}
