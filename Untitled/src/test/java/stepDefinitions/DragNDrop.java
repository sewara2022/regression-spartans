package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.driver;

public class DragNDrop {

    @Given("User is on Formy drag and drop page")
    public void user_is_on_formy_drag_and_drop_page() {

        driver.get("https://formy-project.herokuapp.com/dragdrop");
    }
    @When("User performs drag and drop")
    public void user_performs_drag_and_drop() {
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector("#image"));
        WebElement target = driver.findElement(By.cssSelector("#box"));
        action.dragAndDrop(source,target).perform();
    }
    @Then("User should see Dropped success message")
    public void user_should_see_dropped_success_message() {
        String expected = "Dropped!";
        String actual = driver.findElement(By.cssSelector("#box")).getText();
        assertEquals(expected,actual);
    }


}
