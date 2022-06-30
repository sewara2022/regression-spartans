package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.driver;

public class Datepicker {
    @Given("User is on Formy datepicker page")
    public void user_is_on_formy_datepicker_page() {
        driver.get("https://formy-project.herokuapp.com/datepicker");
    }
    @When("User gives date")
    public void user_gives_date() {
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("07/04/2022");

    }

}
