package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseDesktopShip {

    @When("Customer adds a desktop to the cart")
    public void customer_adds_a_desktop_to_the_cart() {
        driver.findElement(By.cssSelector(".top-menu a[href=\"/computers\"]")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/desktops\"]")).click();
        driver.findElement(By.cssSelector(".product-title a[href=\"/build-your-cheap-own-computer\"]")).click();
        driver.findElement(By.cssSelector(".add-to-cart-panel #add-to-cart-button-72")).click();

    }
    @When("Customer chooses ship to home address")
    public void customer_chooses_ship_to_home_address() {
        driver.findElement(By.cssSelector("#opc-shipping input[type=\"button\"]")).click();
        driver.findElement(By.cssSelector("#opc-shipping_method input[type=\"button\"]")).click();

    }
}
