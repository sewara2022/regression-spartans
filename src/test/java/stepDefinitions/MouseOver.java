package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import static stepDefinitions.TestSuiteSetUp.driver;

public class MouseOver {
    @Given("User is on amazon.com")
    public void user_is_on_amazon_com() {
        driver.navigate().to("https://www.amazon.com/");

    }
    @When("User performs mouse-over")
    public void user_performs_mouse_over() {
       Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.cssSelector("#nav-link-accountList"));
        action.moveToElement(target).perform();
    }
    @Then("User should be able to see Your list title")
    public void user_should_be_able_to_see_Your_list_title() {
        WebElement title = driver.findElement(By.cssSelector("#nav-al-title"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(title));

        String expected = "Your Lists";
        String actual = title.getText();
        assertEquals(expected,actual);

    }

}
