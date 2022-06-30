package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.driver;

public class LaunchPrompt {
    @When("User clicks on launch prompt")
    public void user_clicks_on_launch_prompt() {
        driver.findElement(By.cssSelector("#my-prompt")).click();
    }
    @Then("User enter the name")
    public void user_enter_the_name() throws InterruptedException {
        Thread.sleep(3000);
        String name = "Yevgeniya";
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();

    }
    @Then("User can verify the name")
    public void user_can_verify_the_name() {
        String name = "Yevgeniya";
        String expected = "You typed: " + name;
        String actual = driver.findElement(By.cssSelector("#prompt-text")).getText();
        assertEquals(actual,expected);
    }

}
