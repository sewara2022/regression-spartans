package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class Alerts {
    @Given("User goes to Formy alert page")
    public void user_goes_to_formy_alert_page() {
        driver.get("https://formy-project.herokuapp.com/switch-window");
    }
    @When("User clicks on open alert")
    public void user_clicks_on_open_alert() {
        driver.findElement(By.cssSelector("#alert-button")).click();
    }
    @When("User agrees to the alert")
    public void user_agrees_to_the_alert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        alert.dismiss();  /to dismiss alert

    }
    @Then("User should no see any alerts")
    public void user_should_no_see_any_alerts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
