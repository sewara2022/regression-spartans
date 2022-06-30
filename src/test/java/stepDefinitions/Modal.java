package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class Modal {
    @Given("User goes to Formy modal page")
    public void user_goes_to_formy_modal_page() {
        driver.get("https://formy-project.herokuapp.com/modal");
    }
    @When("User clicks on open modal button")
    public void user_clicks_on_open_modal_button() {
        driver.findElement(By.cssSelector("#modal-button")).click();
    }
    @When("User clicks on close modal")
    public void user_clicks_on_close_modal() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#close-button")).click();
    }


}
