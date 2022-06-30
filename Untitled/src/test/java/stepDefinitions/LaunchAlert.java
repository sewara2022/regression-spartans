package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class LaunchAlert {
    @Given("User is on practice site")
    public void user_is_on_practice_site() {
       driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
    }
    @When("User clicks on launch alert")
    public void user_clicks_on_launch_alert() {
        driver.findElement(By.cssSelector("#my-alert")).click();
    }
    @Then("User can dismiss the alert")
    public void user_can_dismiss_the_alert() {
       Alert alert = driver.switchTo().alert();
       alert.dismiss();
    }

}
