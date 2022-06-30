package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.driver;

public class ModalBoniGarcia {
    @When("User clicks on launch modal")
    public void user_clicks_on_launch_modal() {
        driver.findElement(By.cssSelector("#my-modal")).click();
    }
    @Then("User click on Save changes")
    public void user_click_on_save_changes() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".modal-footer button:last-of-type")).click();
    }
    @Then("User can verify Save changes was chosen")
    public void user_can_verify_save_changes_was_chosen() {
        String expected = "You chose: Save changes";
        String actual = driver.findElement(By.cssSelector("#modal-text")).getText();
        assertEquals(actual,expected);

    }
}
