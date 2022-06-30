package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class ApparelPurchase {
    @When("Customer adds apparel to the cart")
    public void customer_adds_apparel_to_the_cart() {
        driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/blue-and-green-sneaker\"]")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button-28")).click();
    }
}
