package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import static stepDefinitions.TestSuiteSetUp.driver;

public class Scroll {
    @Given("User is Formy scroll page")
    public void user_is_formy_scroll_page() {
        driver.get("https://formy-project.herokuapp.com/scroll");
    }
    @When("User scrolls down")
    public void user_scrolls_down() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
        js.executeScript("window.scrollBy(0,500)"); // scroll up is negative 0,-500
    }
}
