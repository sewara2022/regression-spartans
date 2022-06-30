package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class CameraPurchase {
    @When("Customer adds a camera to the card")
    public void customer_adds_a_camera_to_the_card() {

        driver.findElement(By.cssSelector(".top-menu a[href=\"/electronics\"]")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/camera-photo\"]")).click();
        driver.findElement(By.cssSelector(".picture a[href=\"/digital-slr-camera\"]")).click();
        driver.findElement(By.cssSelector(".add-to-cart #add-to-cart-button-18")).click();

    }
}
