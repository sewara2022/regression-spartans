package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.driver;

public class LaunchConfirm {
    @When("User clicks on launch confirm")
    public void user_clicks_on_launch_confirm() {
        driver.findElement(By.cssSelector("#my-confirm")).click();
    }
    @Then("User accepts the confirm alert")
    public void user_accepts_the_confirm_alert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Then("User can verify alert was accepted")
    public void user_can_verify_alert_was_accepted() {
        String expected = "You chose: true";
        String actual = driver.findElement(By.cssSelector("#confirm-text")).getText();
        assertEquals(actual,expected);
    }

}
